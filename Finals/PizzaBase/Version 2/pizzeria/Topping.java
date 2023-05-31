package pizzeria;

public class Topping
{
	private String name;
	private double cost;

	public Topping(String name, double cost)
	{
		this.name = name;
		if(cost<0)
		{
			this.cost = 0;
		}
		else
		{
			this.cost = cost;
		}
	}

	public String getName(){ return this.name;}
	public double getCost(){ return this.cost;}
	
}