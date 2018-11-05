
public abstract class Animal implements Feedable {
	static private int MAX_feed = 100;
	private int feedPercentage;
	
	//FEEDPERCENTAGE SETTER
	public void setFeedPercentage(int feedpercentage) {
		this.feedPercentage = feedpercentage;
	}
	
	//FEEDPERCENTAGE GETTER
	public int getFeedPercentage() {
		return this.feedPercentage;
	}
	
	//FEEDING ANIMAL CERTAIN AMOUNT
	void feed(int feedAmount) {
		int currentFeed = this.getFeedPercentage();
		this.setFeedPercentage(currentFeed+feedAmount);
	}
	
	//CHECKING IF ANIMAL IS HUNGRY
	public boolean isHungry() {
		if (this.feedPercentage>50) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
