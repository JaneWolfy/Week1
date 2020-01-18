package cake;

public class Candles extends Decoration {
	public Cake cake;

	//Wraps Candles around Cake
	public Candles(Cake cake) {
		this.cake = cake;
	}
	
	//Adds Candles to description
	public String getDescription() {
		return cake.getDescription()+ ", Candles";
	}
	
	//Adds cost of Candles
	public double cost() {
		return .50 + cake.cost();
	}


}
