public class Passenger
{
	private String name;
	public boolean isPWD;

	public Passenger(String name, boolean isPWD)
	{
		this.name = name;
		this.isPWD = isPWD;
	}

	public String getName()
	{
		return this.name;
	}

	@Override
	public boolean equals(Object obj)
	{
		boolean res = false;
		if(!(this.name.equals(obj)))
		{
			res = true;
		}
		return res;
	}

	@Override
	public String toString()
	{
		return this.name +((this.isPWD)?" [P]":"")+"\n";
	}
}