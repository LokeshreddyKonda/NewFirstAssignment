
public class Profit {
	
	private String profit;
	private String profitPercent;
	
	public Profit(String profit, String profitPercent) {
		super();
		this.profit = profit;
		this.profitPercent = profitPercent;
		
		System.out.println("Profit Data Updated");
	}

	public String getProfit() {
		return profit;
	}

	public String getProfitPercent() {
		return profitPercent;
	}

	

}
