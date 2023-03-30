public class Vehicle
{
	private double load;
	private double maxLoad;

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

	@Override
	public String toString()
	{
		return ("Vehicle load is "+ this.load + "kg");
	}
}