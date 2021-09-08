import java.util.Scanner;

public class StockMarketMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserAccountId: ");
		String id = sc.next();
		System.out.println("Enter User Name: ");
		String name = sc.next();
		System.out.println("Enter Mobile: ");
		String mobile = sc.next();
		System.out.println("Enter Profit: ");
		int profit = sc.nextInt();
		System.out.println("Enter Loss: ");
		int loss = sc.nextInt();
		
		String profitPercent = (profit/100)+"";
		String lossPercent = (loss/100)+"";
		
		Profit profitObject = new Profit(profit+"",profitPercent);
		Loss lossObject = new Loss(loss+"",lossPercent);
		
		UserAccount user = new UserAccount(id,name,mobile,profitObject,lossObject);
		user.displayUserDetails();
		
		
	}

}
