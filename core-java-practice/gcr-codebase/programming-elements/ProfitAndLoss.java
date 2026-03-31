package scenario_based;

public class ProfitAndLoss {
	public static void main(String[] args) {
		int costPrice = 129;
		int sellingPrice = 191;
		
		int profit = sellingPrice-costPrice;
		float proftPer = profit/costPrice*100;
		
		System.out.println(
			    "The cost price in INR is " + costPrice +
			    " and selling price is INR " + sellingPrice + "\n" +
			    "The profit is INR " + profit +
			    " and the profit percentage is " + proftPer
			);


	}

}
