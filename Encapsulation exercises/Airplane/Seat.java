public class Seat
{
	private String name;

	public Seat()
	{
		this.name = null;
	}

	public Seat(String name)
	{
		this.name = name;
	}

	public String getName(){return this.name;}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return ("This seat is " + this.name);
	}
}