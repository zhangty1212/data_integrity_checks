package test1;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;

public class FolderUpload {

	// 在bucket里创建文件夹，创建的文件夹名称应以"/"结尾

	// 参数为bucket名字，要创建的文件夹名字。
	public static void createfolder(String bucketName, String objectName,
			String endpoint, String accessKeyId, String accessKeySecret)
			throws IOException {

		OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		ObjectMetadata objectMeta = new ObjectMetadata();

		/*
		 * 这里的size为0,注意OSS本身没有文件夹的概念,这里创建的文件夹本质上是一个size为0的Object,dataStream仍然可以有数据
		 */
		byte[] buffer = new byte[0];
		ByteArrayInputStream in = new ByteArrayInputStream(buffer);
		objectMeta.setContentLength(0);
		try {
			client.putObject(bucketName, objectName, in, objectMeta);
		} finally {
			in.close();
		}
	}

	// 本地文件夹上传到云端
	// 参数为：bucket名字，文件夹中的文件上传到云端时被命名的名字，云端文件夹名称，上传的文件夹在本地的路径。
	public static void putObject(String bucketName, String key,
			String foldername, String filePath, String endpoint,
			String accessKeyId, String accessKeySecret)
			throws FileNotFoundException {

		OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		File file = new File(filePath);

		String[] list = file.list();
		for (int i = 0; i < list.length; i++) {
			File files = new File(filePath + "\\" + list[i]);
			System.out.println("文件名：" + files.getName());
			InputStream content = new FileInputStream(files);
			ObjectMetadata meta = new ObjectMetadata();
			meta.setContentLength(files.length());

			// 上传Object
			PutObjectResult result = client.putObject(bucketName, foldername
					+ files.getName(), content, meta);
		}
	}

}
