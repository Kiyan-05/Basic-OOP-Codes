public class Wheel
{
	private double airVolume;

	public Wheel()
	{
		this.airVolume = 0;
	}

	public Wheel(double volume)
	{

		this.airVolume = volume<0? 0: volume;
	}

	public double getAirVolume()
	{
		return this.airVolume;
	}

	public void setAirVolume(double airVolume)
	{
		if(airVolume >= 0)
			this.airVolume = airVolume;
	}

	public boolean isFlat()
	{
		return this.airVolume == 0;
	}

	@Override
	public String toString()
	{
		return "This wheel has a volume of: " + this.airVolume + "\n";
	}
}