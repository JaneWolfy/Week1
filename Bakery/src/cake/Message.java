package cake;

public class Message extends Decoration {
	public Cake cake;

	//Wraps Message around the current cake object
	public Message(Cake cake) {
		this.cake = cake;
	}
	
	//Adds the description of Message to the cakes current description
	public String getDescription() {
		return cake.getDescription()+ ", Icing Message";
	}
	
	//Adds the cost of message to the cakes current cost
	public double cost() {
		return .75 + cake.cost();
	}


}
