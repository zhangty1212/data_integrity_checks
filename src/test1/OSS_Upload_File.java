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

		// 初始化OSSClient
		OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);

		// 获取指定文件的输入流
		File file = new File(filePath);
		InputStream content = new FileInputStream(file);

		// 创建上传Object的Metadata
		ObjectMetadata meta = new ObjectMetadata();

		// 必须设置ContentLength
		meta.setContentLength(file.length());
		key = file.getName();

		// 上传Object.
		PutObjectResult result = client.putObject(bucketName, key, content,
				meta);

		// 看是否上传成功
		ObjectMetadata ObjectMeta = client.getObjectMetadata(bucketName, key);
		int a = (int) ObjectMeta.getContentLength();
		int b = (int) file.length();
		if (a == b) {

			JFrame frame1 = new JFrame("上传显示");
			// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JLabel j = new JLabel("上传文件成功！", CENTER);
			frame1.add(j);
			frame1.setBounds(580, 280, 250, 120);
			frame1.setVisible(true);
		} else {

			System.out.println(" 上传失败！ ");
		}

	}

}
