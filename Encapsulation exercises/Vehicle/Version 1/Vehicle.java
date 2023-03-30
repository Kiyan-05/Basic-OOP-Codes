public class Vehicle
{
	public double load;
	public double maxLoad;

	public Vehicle(double maxLoad)
	{
		this.load = 0;
		this.maxLoad = maxLoad;
	}

	public double getLoad()
	{
		return this.load;
	}

	public double getMaxLoad()
	{
		return this.maxLoad;
	}

	public void addLoad(double load)
	{
		this.load += load;
	}

	@Override
	public String toString()
	{
		return ("Vehicle load is "+ this.load + "kg");
	}
}