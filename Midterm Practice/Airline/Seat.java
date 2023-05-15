public class Seat
{
	private String name;
	private Passenger passenger;

	public Seat(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public boolean isAvailable()
	{
		boolean res = false;
		if(this.passenger == null)
			res = true;
		return res;
	}

	public boolean setPassenger(Passenger passenger)
	{
		boolean res = false;
		if(this.passenger == null)
		{
			this.passenger = passenger;
			res = true;
		}
		return res;
	}

	public Passenger getPassenger()
	{
		return this.passenger;
	}

	@Override
	public String toString()
	{
		return "[" + (this.isAvailable()? this.name:"XX") + "]";
	}
}