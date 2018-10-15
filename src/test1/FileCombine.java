package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCombine {

	// ��������˵��
	// sourcefilepath:һ���ļ���·�������ļ��а�������С�ļ�����ЩС�ļ��������ϲ���һ���ļ���
	// directfilepath:�ϲ������ɵ��ļ����ڵ�·��
	public static void filecombine(String sourcefilepath, String directfilepath)
			throws IOException {

		File file = new File(sourcefilepath);

		OutputStream fout = new FileOutputStream(directfilepath);

		System.out.println("����һ���ļ��У��ļ�����Ϊ��" + file.getName());

		String[] list = file.list();

		byte[] b = new byte[2048];
		int nread = 0;
		for (int i = 0; i < list.length; i++) {
			File files = new File(sourcefilepath + "\\" + list[i]);
			System.out.println("�ļ�����" + files.getName());
			InputStream fin = new FileInputStream(files);
			while ((nread = fin.read(b)) != -1) {
				fout.write(b, 0, nread);
				fout.flush();
			}
		}
		fout.close();

	}

}
