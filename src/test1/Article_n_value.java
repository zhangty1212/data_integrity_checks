package test1;

public class Article_n_value {

	

	public static long Article_n( long sf,double n) {
		
        long sfs1=Math.round((double)sf/n);
		
		System.out.println("ʵ���ļ��ֿ��СΪ�� "+sfs1+"�ֽ�");
		
		long n1= (long)Math.ceil((double)sf/sfs1);
		
		System.out.println("ʵ���ļ��ֿ����Ϊ�� "+n1+"��");
					
		
		return n1;
		
		
		}
	
	
}
