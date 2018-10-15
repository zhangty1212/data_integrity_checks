package test1;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.GetObjectRequest;
import com.aliyun.oss.model.ListObjectsRequest;
import com.aliyun.oss.model.OSSObjectSummary;
import com.aliyun.oss.model.ObjectListing;
import com.aliyun.oss.model.ObjectMetadata;

public class Sample_Download {

	// 参数意义： bucketName：云端被下载文件夹所在bucket的名字；foldername:云端被下载文件夹名字；
	// downpath：指定的一个本地文件夹路径，用来存放从云端下载的文件
	public static void sample_getObjects(String bucketName, String foldername1,
			String downpath1, String foldername2, String downpath2,
			String endpoint, String accessKeyId, String accessKeySecret, int c) {

		OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);

		ListObjectsRequest listObjectsRequest1 = new ListObjectsRequest(
				bucketName);
		ListObjectsRequest listObjectsRequest2 = new ListObjectsRequest(
				bucketName);

		// 设定遍历的云端文件夹内文件的名字
		listObjectsRequest1.setPrefix(foldername1);
		listObjectsRequest1.setMaxKeys(1000);

		listObjectsRequest2.setPrefix(foldername2);
		listObjectsRequest2.setMaxKeys(1000);

		// 遍历所有Object
		System.out.println("该文件夹下的Objects:");
		int i = 0;
		int j = 0;
		Map<Integer, String> map1 = new TreeMap<Integer, String>();
		Map<Integer, String> map2 = new TreeMap<Integer, String>();

		ObjectListing listing1;
		boolean isEnd1 = false;

		do {
			listing1 = client.listObjects(listObjectsRequest1);
			isEnd1 = listing1.isTruncated();

			for (OSSObjectSummary objectSummary : listing1.getObjectSummaries()) {

				map1.put(i, objectSummary.getKey());

				// System.out.println(i+" :"+map1.get(i));

				i++;

				// System.out.println(objectSummary.getKey());

			}
			int index = listing1.getObjectSummaries().size() - 1;
			String marker = listing1.getObjectSummaries().get(index).getKey();
			listObjectsRequest1.setMarker(marker);

		} while (isEnd1);

		System.out.println(i);

		ObjectListing listing2;
		boolean isEnd2 = false;

		do {
			listing2 = client.listObjects(listObjectsRequest2);
			isEnd2 = listing2.isTruncated();

			for (OSSObjectSummary objectSummary : listing2.getObjectSummaries()) {

				map2.put(j, objectSummary.getKey());

				// System.out.println(j+" :"+map2.get(j));

				j++;

				// System.out.println(objectSummary.getKey());

			}
			int index = listing2.getObjectSummaries().size() - 1;
			String marker = listing2.getObjectSummaries().get(index).getKey();
			listObjectsRequest2.setMarker(marker);

		} while (isEnd2);

		// 注意这里：num=(int)((Math.random())*(i-1))+1 的设置

		HashSet<Integer> hs = new HashSet<Integer>();
		while (true) {
			int num = (int) ((Math.random()) * (i - 1)) + 1;
			hs.add(num);
			if (hs.size() == c) {
				break;
			}
		}

		System.out.println(hs);

		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {

			int m = it.next();
			GetObjectRequest getObjectRequest1 = new GetObjectRequest(
					bucketName, map1.get(m));
			String str1 = map1.get(m);
			int x = str1.indexOf('/');
			String str11 = str1.substring(x + 1);
			ObjectMetadata objectMetadata1 = client.getObject(
					getObjectRequest1, new File(downpath1 + "\\" + str11));

		}

		Iterator<Integer> its = hs.iterator();

		while (its.hasNext()) {

			int n = its.next();
			GetObjectRequest getObjectRequest2 = new GetObjectRequest(
					bucketName, map2.get(n));
			String str2 = map2.get(n);

			int y = str2.indexOf('/');
			String str22 = str2.substring(y + 1);
			ObjectMetadata objectMetadata2 = client.getObject(
					getObjectRequest2, new File(downpath2 + "\\" + str22));

		}

	}
}
