package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileSeg {

	// ������������
	// sourcefilepath��Ҫ���и���ļ���·�������� F:\\�ļ���\\zhang.pdf
	// directfilepath:�и��С�ļ������·���� ǰ�벿��
	// ��ע�⣩,��������е�s����С�ļ����������·��������F��\\�ļ���1\\zhang.pdf
	// blocksize:���зֵ�ÿ��С�ļ���Ĵ�С����λ�� ���ֽڡ�B

	public static void fileseg(String sourcefilepath, String directfilepath,
			int blocksize) throws IOException {

		File f = new File(sourcefilepath);
		InputStream fin = new FileInputStream(f);

		byte b[] = new byte[blocksize];

		int n = (int) Math.ceil(f.length() / (double) (blocksize));
		System.out.println("�ļ����ֳɵĿ���Ϊ��");
		System.out.println(n);

		int nread = 0;
		for (int i = 1; i <= n; i++) {
			// s�����зֺ��С�ļ������·����
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
