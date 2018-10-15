package test1;

public class Calculate_M_value {

	public static double Calculate_M(double p1, double p2, double p3, long sf,
			int st, int c, int i, int j, int g) {

		double p =  ((g * p3) / 10000 + (st * i * p1) / Math.pow(2, 30));
		double q =  ((sf * c * j * p2) / Math.pow(2, 30));
		double r =  (((sf * i * p1) + (st * c * j * p2))
				/ Math.pow(2, 30) + ((g * c * j * p3) / 10000));

	//	System.out.println(p);
	//	System.out.println(q);
	//	System.out.println(r);

		double M =(2 * Math.sqrt(p * q) + r);
		// System.out.println(M);
		return M;

	}

}
