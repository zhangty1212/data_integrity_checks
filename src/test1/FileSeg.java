package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileSeg {

	// 函数参数介绍
	// sourcefilepath：要被切割的文件的路径；例： F:\\文件夹\\zhang.pdf
	// directfilepath:切割后小文件的输出路径的 前半部分
	// （注意）,下面程序中的s才是小文件完整的输出路径；例：F：\\文件夹1\\zhang.pdf
	// blocksize:被切分的每个小文件快的大小，单位是 “字节”B

	public static void fileseg(String sourcefilepath, String directfilepath,
			int blocksize) throws IOException {

		File f = new File(sourcefilepath);
		InputStream fin = new FileInputStream(f);

		byte b[] = new byte[blocksize];

		int n = (int) Math.ceil(f.length() / (double) (blocksize));
		System.out.println("文件被分成的块数为：");
		System.out.println(n);

		int nread = 0;
		for (int i = 1; i <= n; i++) {
			// s才是切分后的小文件的输出路径；
			String s = String.format("%s%08d", directfilepath, i);
			OutputStream fout = new FileOutputStream(s);
			if ((nread = fin.read(b)) != -1) {
				fout.write(b, 0, nread);
				fout.flush();
			}

			fout.close();
		}
		fin.close();

	}

}
