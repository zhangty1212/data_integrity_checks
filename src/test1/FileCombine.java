package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCombine {

	// 函数参数说明
	// sourcefilepath:一个文件夹路径，该文件夹包含许多的小文件，这些小文件被用来合并成一个文件；
	// directfilepath:合并后生成的文件所在的路径
	public static void filecombine(String sourcefilepath, String directfilepath)
			throws IOException {

		File file = new File(sourcefilepath);

		OutputStream fout = new FileOutputStream(directfilepath);

		System.out.println("这是一个文件夹，文件夹名为：" + file.getName());

		String[] list = file.list();

		byte[] b = new byte[2048];
		int nread = 0;
		for (int i = 0; i < list.length; i++) {
			File files = new File(sourcefilepath + "\\" + list[i]);
			System.out.println("文件名：" + files.getName());
			InputStream fin = new FileInputStream(files);
			while ((nread = fin.read(b)) != -1) {
				fout.write(b, 0, nread);
				fout.flush();
			}
		}
		fout.close();

	}

}
