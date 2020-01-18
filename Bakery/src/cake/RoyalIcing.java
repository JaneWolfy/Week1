package cake;

public class RoyalIcing extends Decoration {
	public Cake cake;

	//Wraps Royal Icing around Cake 
	public RoyalIcing(Cake cake) {
		this.cake = cake;
	}
	
	//Adds Royal Icing to cake description
	public String getDescription() {
		return cake.getDescription()+ ", Royal Icing";
	}
	
	
	//Adds Royal Icing cost to cake cost
	public double cost() {
		return 5.25 + cake.cost();
	}


}
