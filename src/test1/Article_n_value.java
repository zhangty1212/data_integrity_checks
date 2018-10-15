package test1;

public class Article_n_value {

	

	public static long Article_n( long sf,double n) {
		
        long sfs1=Math.round((double)sf/n);
		
		System.out.println("实际文件分块大小为： "+sfs1+"字节");
		
		long n1= (long)Math.ceil((double)sf/sfs1);
		
		System.out.println("实际文件分块个数为： "+n1+"个");
					
		
		return n1;
		
		
		}
	
	
}
