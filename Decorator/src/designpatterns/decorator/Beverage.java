package designpatterns.decorator;

public abstract class Beverage {
	
	String description = "Unknown Bewerage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
