package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class FileBlock_Hmd5_Compute {

	// �����������ܣ�
	// fileinpath:������HMAC��MD5��ֵ���ļ���·����
	// fileoutpath:�����������ļ�HMAC��MD5��ֵ�󣬰Ѽ����HMAC��MD5��ֵ������棬��Ϊ�����ļ�HMAC��MD5��ֵ���ļ�·����

	public static void hmacmd5(String fileinpath, String fileoutpath,
			String str1) throws NoSuchAlgorithmException, InvalidKeyException,
			IOException {

		String k = str1;
		byte sk[] = k.getBytes();

		File f1 = new File(fileinpath);
		InputStream fin = new FileInputStream(f1);
		byte b1[] = new byte[(int) f1.length()];
		fin.read(b1);

		SecretKey secretKey = new SecretKeySpec(sk, "HmacMD5");

		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		mac.init(secretKey);
		byte b2[] = mac.doFinal(b1);

		String str = new FileBlock_Hmd5_Compute().bytes(b2);

		byte b3[] = str.getBytes();
		File f2 = new File(fileoutpath);
		OutputStream fout = new FileOutputStream(f2);

		fout.write(b3);
	}

	public static String bytes(byte[] bytes) {
		final String HEX = "0123456789abcdef";
		StringBuilder sb = new StringBuilder(bytes.length * 2);
		for (byte b : bytes) {
			// ȡ������ֽڵĸ�4λ��Ȼ����0x0f�����㣬�õ�һ��0-15֮������ݣ�ͨ��HEX.charAt(0-15)��Ϊ16������
			sb.append(HEX.charAt((b >> 4) & 0x0f));
			// ȡ������ֽڵĵ�λ����0x0f�����㣬�õ�һ��0-15֮������ݣ�ͨ��HEX.charAt(0-15)��Ϊ16������
			sb.append(HEX.charAt(b & 0x0f));
		}

		return sb.toString();
	}

}
