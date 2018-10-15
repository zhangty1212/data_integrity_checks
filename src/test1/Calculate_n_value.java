package test1;

public class Calculate_n_value {

	public static double Calculate_n(double p1, double p2, double p3, long sf,
			int st, int c, int i, int j, int g) {

		double p =  ((g * p3) / 10000 + (st * i * p1) / Math.pow(2, 30));
		double q =  ((sf * c * j * p2) / Math.pow(2, 30));

		//System.out.println(p);
	//	System.out.println(q);

		double n =  Math.sqrt((q / p));
		//System.out.println(n);
		return n;

	}

}
