package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5_Compute {

	
	public static String getFileMD5(File file) throws NoSuchAlgorithmException, IOException {
		
		 if (!file.isFile()){
	  	      return null;
	  	    }
		 
		 MessageDigest md = MessageDigest.getInstance("MD5");
		 FileInputStream in= new FileInputStream(file);
		 int l=(int) file.length();
		 byte buffer[] = new byte[l];
		 in.read(buffer, 0, l);
		
		 byte b[]=md.digest(buffer);
		
		     return(MD5_Compute.bytes(b));
		 
	 }
	 
	 public static String bytes(byte[] bytes)  
	    {  
	        final String HEX = "0123456789abcdef";  
	        StringBuilder sb = new StringBuilder(bytes.length * 2);  
	        for (byte b : bytes)  
	        {  
	            // 取出这个字节的高4位，然后与0x0f与运算，得到一个0-15之间的数据，通过HEX.charAt(0-15)即为16进制数  
	            sb.append(HEX.charAt((b >> 4) & 0x0f));  
	            // 取出这个字节的低位，与0x0f与运算，得到一个0-15之间的数据，通过HEX.charAt(0-15)即为16进制数  
	            sb.append(HEX.charAt(b & 0x0f));  
	        }  
	  
	        return sb.toString();  
	    }  
	 
	

	
	
	
	
	
	
	
	
	
	
}
