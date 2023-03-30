import java.util.*;

public class Vehicle
{
	public Engine engine;
	private List<Wheel> wheels;

	public Vehicle(int numOfWheels)
	{
		this.engine = null;
		this.wheels = new ArrayList<Wheel>();
		this.wheels.add(new Wheel());
		for(int i=1; i<numOfWheels; i++)
			this.wheels.add(new Wheel());
	}

	public Vehicle(Engine e, int numOfWheels)
	{
		this.engine = e;
		this.wheels = new ArrayList<Wheel>();
		this.wheels.add(new Wheel());
		for(int i=1; i<numOfWheels; i++)
			this.wheels.add(new Wheel());
	}

	public int getNumberOfWheels()
	{
		return this.wheels;
	}

	public boolean canRun()
	{
		boolean result = true;
		for(Wheel w: this.wheels)
		{
			if(w.isFlat())
			{
				result = false;
				break;
			}
		}
		return result;
	}

	public void addAirToWheel(double airVolume, int wheelNumber)
	{
		if(wheelNumber >= 0 && wheelNumber < this.wheels.size() && airVolume >= 0)
		{
			this.wheels.get(wheelNumber).setAirVolume(airVolume);
		}
	}

	@Override
	public String toString()
	{
		String res = " ";
		result += "This vehicle has " + (this.engine == null? "no engine.":" an engine.");
		for(Wheel w: this.wheels)
		{
			result += w;
		}
		return result;
	}
}