package cake;

public class Bakery {
	public static void main(String args[]) {
		//Tests Marble, choclate buttercream, and sprinkles
		Cake cake1 = new Marble();
		cake1 = new ChocolateButtercream(cake1);
		cake1 = new Sprinkles(cake1);
		System.out.println(cake1.getDescription() + " $" + cake1.cost());
		
		//Tests Yellow cake, vanila buttercream, icing message
		Cake cake2 = new Yellow();
		cake2 = new VanillaButtercream(cake2);
		cake2 = new Message(cake2);
		System.out.println(cake2.getDescription() + " $" + cake2.cost());
		
		//Tests White Cake, Royal Icing, and image
		Cake cake3 = new White();
		cake3 = new RoyalIcing(cake3);
		cake3 = new Image(cake3);
		System.out.println(cake3.getDescription() + " $" + cake3.cost());
		
		//Tests Chocolate Cake and Candels
		Cake cake4 = new Chocolate();
		cake4 = new Candles(cake4);
		System.out.println(cake4.getDescription() + " $" + cake4.cost());
	}
}
