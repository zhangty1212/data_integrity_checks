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

		// 给出一个文件路径，把该文件的内容存储在byte数组中;

		String fileinpath = s;
		File f = new File(fileinpath);
		InputStream fin = new FileInputStream(f);
		byte b[] = new byte[(int) f.length()];

		fin.read(b);

		// 生成密钥
		String k = sk1;
		byte sk[] = k.getBytes();
		SecretKey secretKey = new SecretKeySpec(sk, "HmacMD5");

		// 生成HMAC码
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		mac.init(secretKey);
		byte b1[] = mac.doFinal(b);

		// 把生成的HMAC码转换成16进制的字符串输出

		// 这种用 BigInteger方法把字节数组转化为16进制字符串的方法有bug,例如：
		// 如果计算结果为：06bdc5e5e6d985d1e7de2ba7099876f8，则前边的0输不出来，结果会从32个字节变成31个字节。

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
			// 取出这个字节的高4位，然后与0x0f与运算，得到一个0-15之间的数据，通过HEX.charAt(0-15)即为16进制数
			sb.append(HEX.charAt((b >> 4) & 0x0f));
			// 取出这个字节的低位，与0x0f与运算，得到一个0-15之间的数据，通过HEX.charAt(0-15)即为16进制数
			sb.append(HEX.charAt(b & 0x0f));
		}

		return sb.toString();
	}

}
