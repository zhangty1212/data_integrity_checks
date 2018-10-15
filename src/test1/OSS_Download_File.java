package test1;

import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.GetObjectRequest;
import com.aliyun.oss.model.ObjectMetadata;

public class OSS_Download_File {

	private static final int CENTER = 0;

	// 下载object
	public static void getObjectRequest(String bucketName, String key,
			String directorypath, String endpoint, String accessKeyId,
			String accessKeySecret) throws IOException {

		OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName,
				key);

		ObjectMetadata objectMetadata = client.getObject(getObjectRequest,
				new File(directorypath + "\\" + key));

		// ?? 如何调用 MyGUI 中的 局部变量

		// ObjectMetadata objectMetadata = client.getObject(getObjectRequest,
		// new File( text4.getText() +key));
		ObjectMetadata ObjectMeta = client.getObjectMetadata(bucketName, key);

		int a = (int) ObjectMeta.getContentLength();
		File file = new File(directorypath + "\\" + key);

		int b = (int) file.length();
		if (a == b) {

			// System.out.println("下载情况");
			JFrame frame1 = new JFrame("下载显示");
			// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JLabel j = new JLabel("下载文件成功！", CENTER);
			frame1.add(j);
			frame1.setBounds(580, 280, 200, 120);
			frame1.setVisible(true);
		} else {

			System.out.println(" 下载失败！ ");
		}

	}

}
