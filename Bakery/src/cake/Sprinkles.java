package cake;

public class Sprinkles extends Decoration {
	public Cake cake;

	//Wraps Sprinkles around current cake
	public Sprinkles(Cake cake) {
		this.cake = cake;
	}
	
	//Adds Sprinkles to cake description
	public String getDescription() {
		return cake.getDescription()+ ", Sprinkles";
	}
	
	//Adds cost of sprinkles to cake cost
	public double cost() {
		return .50 + cake.cost();
	}

}