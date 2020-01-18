package cake;

public class Image extends Decoration {
	public Cake cake;

	//Wraps Image around the current cake object
	public Image(Cake cake) {
		this.cake = cake;
	}
	
	//Adds the description of Image to the cakes current description
	public String getDescription() {
		return cake.getDescription()+ ", Printed Image";
	}
	
	//Adds the cost of Image to the cakes current cost
	public double cost() {
		return 1.50 + cake.cost();
	}
}
