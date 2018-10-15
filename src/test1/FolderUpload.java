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

	// ��bucket�ﴴ���ļ��У��������ļ�������Ӧ��"/"��β

	// ����Ϊbucket���֣�Ҫ�������ļ������֡�
	public static void createfolder(String bucketName, String objectName,
			String endpoint, String accessKeyId, String accessKeySecret)
			throws IOException {

		OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		ObjectMetadata objectMeta = new ObjectMetadata();

		/*
		 * �����sizeΪ0,ע��OSS����û���ļ��еĸ���,���ﴴ�����ļ��б�������һ��sizeΪ0��Object,dataStream��Ȼ����������
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

	// �����ļ����ϴ����ƶ�
	// ����Ϊ��bucket���֣��ļ����е��ļ��ϴ����ƶ�ʱ�����������֣��ƶ��ļ������ƣ��ϴ����ļ����ڱ��ص�·����
	public static void putObject(String bucketName, String key,
			String foldername, String filePath, String endpoint,
			String accessKeyId, String accessKeySecret)
			throws FileNotFoundException {

		OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		File file = new File(filePath);

		String[] list = file.list();
		for (int i = 0; i < list.length; i++) {
			File files = new File(filePath + "\\" + list[i]);
			System.out.println("�ļ�����" + files.getName());
			InputStream content = new FileInputStream(files);
			ObjectMetadata meta = new ObjectMetadata();
			meta.setContentLength(files.length());

			// �ϴ�Object
			PutObjectResult result = client.putObject(bucketName, foldername
					+ files.getName(), content, meta);
		}
	}

}
