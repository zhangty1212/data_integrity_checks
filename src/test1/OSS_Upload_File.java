package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.JFrame;
import javax.swing.JLabel;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;

public class OSS_Upload_File {

	private static final int CENTER = 0;

	public static void putObject(String bucketName, String key,
			String filePath, String endpoint, String accessKeyId,
			String accessKeySecret) throws FileNotFoundException {

		// ��ʼ��OSSClient
		OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);

		// ��ȡָ���ļ���������
		File file = new File(filePath);
		InputStream content = new FileInputStream(file);

		// �����ϴ�Object��Metadata
		ObjectMetadata meta = new ObjectMetadata();

		// ��������ContentLength
		meta.setContentLength(file.length());
		key = file.getName();

		// �ϴ�Object.
		PutObjectResult result = client.putObject(bucketName, key, content,
				meta);

		// ���Ƿ��ϴ��ɹ�
		ObjectMetadata ObjectMeta = client.getObjectMetadata(bucketName, key);
		int a = (int) ObjectMeta.getContentLength();
		int b = (int) file.length();
		if (a == b) {

			JFrame frame1 = new JFrame("�ϴ���ʾ");
			// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JLabel j = new JLabel("�ϴ��ļ��ɹ���", CENTER);
			frame1.add(j);
			frame1.setBounds(580, 280, 250, 120);
			frame1.setVisible(true);
		} else {

			System.out.println(" �ϴ�ʧ�ܣ� ");
		}

	}

}
