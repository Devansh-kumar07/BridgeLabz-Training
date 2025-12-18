package scenario_based;

public class Discount {
	public static void main(String[] args) {
		int courseFee=125000;
		int discountPer=10;
		
		int discount = 125000/10;
		int feeToPay = courseFee-discount;
		System.out.println("the discount ammount is INR"+discount+"final discount fee"+feeToPay);
	}

}
