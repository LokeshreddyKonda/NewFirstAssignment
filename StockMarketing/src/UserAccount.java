
public class UserAccount {

	private String userAccountId;
	private String userName;
	private String userMobile;
	
	private Profit profit;
	private Loss loss;
	
	private String flag;
	
	public UserAccount(String userAccountId, String userName, String userMobile, Profit profit, Loss loss) {
		super();
		this.userAccountId = userAccountId;
		this.userName = userName;
		this.userMobile = userMobile;
		this.profit = profit;
		this.loss = loss;
		
		System.out.println("User Data Updated");
		
	}
	

	public void displayUserDetails() {
		System.out.println();
		System.out.println("Users Data");
		System.out.println("UserId: "+this.userAccountId);
		System.out.println("UserName: "+this.userName);
		System.out.println("UserMobile: "+this.userMobile);
		System.out.println("UserAverageProfit: "+this.profit.getProfit());
		System.out.println("UserAverageLoss: "+this.loss.getLoss());
	}
	
}
