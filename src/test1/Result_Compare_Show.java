package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

public class Result_Compare_Show {

	public static String compare(String firstfolderpath,
			String secondfolderpath, String firstcombine, String secondcombine)
			throws IOException {

		File file1 = new File(firstfolderpath);
		File file2 = new File(secondfolderpath);

		File file3 = new File(firstcombine);
		File file4 = new File(secondcombine);

		OutputStream fout1 = new FileOutputStream(firstcombine);
		OutputStream fout2 = new FileOutputStream(secondcombine);

		String[] list1 = file1.list();
		String[] list2 = file2.list();

		byte[] b = new byte[2048];
		int nread = 0;
		for (int i = 0; i < list1.length; i++) {
			File files = new File(firstfolderpath + "\\" + list1[i]);
			// System.out.println("文件名："+files.getName());
			InputStream fin = new FileInputStream(files);
			while ((nread = fin.read(b)) != -1) {
				fout1.write(b, 0, nread);
				fout1.flush();
			}
		}

		fout1.close();

		for (int j = 0; j < list2.length; j++) {
			File files = new File(secondfolderpath + "\\" + list2[j]);
			// System.out.println("文件名："+files.getName());
			InputStream fin = new FileInputStream(files);
			while ((nread = fin.read(b)) != -1) {
				fout2.write(b, 0, nread);
				fout2.flush();
			}
		}
		fout2.close();

		MessageDigest digest1 = null;
		MessageDigest digest2 = null;
		FileInputStream in1 = null;
		FileInputStream in2 = null;
		byte buffer[] = new byte[1024];
		int len;

		try {
			digest1 = MessageDigest.getInstance("MD5");
			digest2 = MessageDigest.getInstance("MD5");
			in1 = new FileInputStream(file3);
			in2 = new FileInputStream(file4);
			while ((len = in1.read(buffer, 0, 1024)) != -1) {
				digest1.update(buffer, 0, len);
			}

			while ((len = in2.read(buffer, 0, 1024)) != -1) {
				digest2.update(buffer, 0, len);
			}
			in1.close();
			in2.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		BigInteger bigInt1 = new BigInteger(1, digest1.digest());
		BigInteger bigInt2 = new BigInteger(1, digest2.digest());

		if (bigInt1.toString(16).equals(bigInt2.toString(16)))
			return "1";

		else
			return "0";

	}

}
