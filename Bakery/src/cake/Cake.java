package cake;

public abstract class Cake {
	
	//Creates description for cake
	String description = "Unkown Cake";
	
	//Creates method to get description
	public String getDescription() {
		return description;
	}
	
	//Creates cost method.
	public abstract double cost();
}
