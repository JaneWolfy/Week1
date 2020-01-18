package cake;

public abstract class Cake {
	String description = "Unkown Cake";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
