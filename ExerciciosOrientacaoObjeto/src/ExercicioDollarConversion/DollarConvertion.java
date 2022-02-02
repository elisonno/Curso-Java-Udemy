package ExercicioDollarConversion;

public class DollarConvertion {
	public static final double IOF = 0.06;
	
	public static double calculateRate(double priceDollar, double quantityDollar) {
		return priceDollar*quantityDollar + priceDollar*quantityDollar*IOF;
	}
	
	

}
