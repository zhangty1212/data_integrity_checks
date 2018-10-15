package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Hmac_Compute {

	public static String HmacCompute(String s, String sk1) throws IOException,
			NoSuchAlgorithmException, InvalidKeyException {

		// ����һ���ļ�·�����Ѹ��ļ������ݴ洢��byte������;

		String fileinpath = s;
		File f = new File(fileinpath);
		InputStream fin = new FileInputStream(f);
		byte b[] = new byte[(int) f.length()];

		fin.read(b);

		// ������Կ
		String k = sk1;
		byte sk[] = k.getBytes();
		SecretKey secretKey = new SecretKeySpec(sk, "HmacMD5");

		// ����HMAC��
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		mac.init(secretKey);
		byte b1[] = mac.doFinal(b);

		// �����ɵ�HMAC��ת����16���Ƶ��ַ������

		// ������ BigInteger�������ֽ�����ת��Ϊ16�����ַ����ķ�����bug,���磺
		// ���������Ϊ��06bdc5e5e6d985d1e7de2ba7099876f8����ǰ�ߵ�0�䲻������������32���ֽڱ��31���ֽڡ�

		/*
		 * BigInteger bigInteger = new BigInteger(1,b1); String str=
		 * bigInteger.toString(16); System.out.println(str);
		 */

		new Hmac_Compute();
		return (Hmac_Compute.bytes(b1));

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
