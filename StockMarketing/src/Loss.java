
public class Loss {
	
	private String loss;
	private String lossPercent;
	
	public Loss(String loss, String lossPercent) {
		super();
		this.loss = loss;
		this.lossPercent = lossPercent;
		
		System.out.println("Loss Data Updated");
	}

	public String getLoss() {
		return loss;
	}

	public String getLossPercent() {
		return lossPercent;
	}


}
