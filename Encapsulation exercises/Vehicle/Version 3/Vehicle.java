public class Vehicle
{
	private double load;
	private double maxLoad;

	public Vehicle(double max_load)
	{
		this.load = 0;
		this.maxLoad = max_load;
	}

	public double getLoad()
	{
		return this.load;
	}

	public double getMaxLoad()
	{
		return this.maxLoad;
	}

	public boolean addBox(double weight)
	{
		double temp = this.load;
		temp += weight;
		if(temp<this.maxLoad)
		{
			this.load += weight;
			return true;
		}
		else
		{
			return false;
		}
	}

	private double newtsToKilo(double weight)
	{
		return (weight*9.8);
	}

	private double kiloToNewts(double weight)
	{
		return (weight/9.8);
	}
}