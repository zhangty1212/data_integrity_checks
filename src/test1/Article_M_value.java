package test1;

public class Article_M_value {

	
	public static double Article_M(double n,double p1,double p2,double p3, long sf,
			int st, int c, int i, int j, int g ) {
		
		
                     long sfs1=Math.round((double)sf/n);
		
		             System.out.println("实际文件分块大小为： "+sfs1+"字节");
		
                     long n1= (long)Math.ceil((double)sf/sfs1);
		                 
		             System.out.println("实际文件分块个数为： "+n1+"个");
		
		             double p11 =  ((g * p3* n1) / 10000 );
				//	System.out.println(p11);
					
					double q11 =  ((((st * n1 )+ sf)*i*p1)/Math.pow(2, 30));
				//	System.out.println(q11);
					
					double r11 = (((st+sfs1)*c*p2/Math.pow(2, 30)) + (g*c*p3)/10000 )*j ;
				//	System.out.println(r11);
					
					double M1 = (double) p11+q11+r11;
			        
					return M1;
	
		}
}
	
