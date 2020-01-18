package cake;

public class VanillaButtercream extends Decoration {
	public Cake cake;

	//Wraps Vanilla Buttercream around cake
	public VanillaButtercream(Cake cake) {
		this.cake = cake;
	}
	
	//Adds Vanilla Buttercream to description
	public String getDescription() {
		return cake.getDescription()+ ", Vanilla Buttercream";
	}
	
	//Adds cost of Vanilla Buttercream
	public double cost() {
		return 2.00 + cake.cost();
	}

}
