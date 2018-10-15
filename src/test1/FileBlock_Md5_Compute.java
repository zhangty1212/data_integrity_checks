package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class FileBlock_Md5_Compute {

	
	public static void getFileMD5(File file, String fileoutpath) throws NoSuchAlgorithmException, IOException {
		
		
		 
		 MessageDigest md = MessageDigest.getInstance("MD5");
		 FileInputStream in= new FileInputStream(file);
		 int l=(int) file.length();
		 byte buffer[] = new byte[l];
		 in.read(buffer, 0, l);
		
		 byte b[]=md.digest(buffer);
		
		
		   /* //���ֽ�����ת��Ϊ16�����ַ������ 
		     return(Md5_Test.bytes(b));*/
		 
		     String str =  FileBlock_Md5_Compute  .bytes(b);

				byte b3[] = str.getBytes();
				File f2 = new File(fileoutpath);
				OutputStream fout = new FileOutputStream(f2);

				fout.write(b3);    
		     
	 }
	
	
	 public static String bytes(byte[] bytes)  
	    {  
	        final String HEX = "0123456789abcdef";  
	        StringBuilder sb = new StringBuilder(bytes.length * 2);  
	        for (byte b : bytes)  
	        {  
	            // ȡ������ֽڵĸ�4λ��Ȼ����0x0f�����㣬�õ�һ��0-15֮������ݣ�ͨ��HEX.charAt(0-15)��Ϊ16������  
	            sb.append(HEX.charAt((b >> 4) & 0x0f));  
	            // ȡ������ֽڵĵ�λ����0x0f�����㣬�õ�һ��0-15֮������ݣ�ͨ��HEX.charAt(0-15)��Ϊ16������  
	            sb.append(HEX.charAt(b & 0x0f));  
	        }  
	  
	        return sb.toString();  
	    }  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
