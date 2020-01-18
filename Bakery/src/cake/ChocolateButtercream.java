package cake;

public class ChocolateButtercream extends Decoration {
	public Cake cake;

	//Wraps Chocolate Buttercream around cake
	public ChocolateButtercream(Cake cake) {
		this.cake = cake;
	}
	
	//Adds Chocolate Buttercream to cake description
	public String getDescription() {
		return cake.getDescription()+ ", Chocolate Buttercream";
	}
	
	//Adds cost of chocolate buttercream to cake cost
	public double cost() {
		return 2.00 + cake.cost();
	}

}
