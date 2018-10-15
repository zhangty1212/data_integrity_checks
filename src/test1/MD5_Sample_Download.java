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

public class MD5_Sample_Download {

	
	public static void md5sample_download(String bucketName, String foldername1,
			String downpath1, String endpoint, String accessKeyId, String accessKeySecret, int c){
		 

			OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);

			ListObjectsRequest listObjectsRequest1 = new ListObjectsRequest(
					bucketName);
			ListObjectsRequest listObjectsRequest2 = new ListObjectsRequest(
					bucketName);

			// 设定遍历的云端文件夹内文件的名字
			listObjectsRequest1.setPrefix(foldername1);
			listObjectsRequest1.setMaxKeys(1000);

		
			// 遍历所有Object
			System.out.println("该文件夹下的Objects:");
			int i = 0;
			
			Map<Integer, String> map1 = new TreeMap<Integer, String>();
		

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

			

		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

