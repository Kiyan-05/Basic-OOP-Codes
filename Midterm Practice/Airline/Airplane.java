import java.util.*;
public class Airplane
{
	private String name;
	private int economyCapacity;
	private int businessClassCapacity;
	private int numEconomyPassengers;
	private int numBusinessClassPassengers;
	private Seat[] economySeats;
	private Seat[] businessClassSeats;

	public Airplane(String name)
	{
		this.name = name;
		this.economyCapacity = 49;
		this.businessClassCapacity = 0;
		this.numEconomyPassengers = 0;
		this.numBusinessClassPassengers = 0;

		this.businessClassSeats = new Seat[this.businessClassCapacity];
		int ctrG = 0;
		for(int i=0; i<this.businessClassCapacity/4; i++)
		{
			for(int j=0; j<4; j++)
				this.businessClassSeats[ctrG++] = new Seat(((i+1)+""+(char)('W'+j)));
		}

		int ctr = 0;
		this.economySeats = new Seat[this.economyCapacity];
		for(int i=0; i<this.economyCapacity/7; i++)
		{
			for(int j=0; j<7; j++)
				this.economySeats[ctr++] = new Seat(((i+1)+""+(char)('A'+j)));
		}
	}

	public void setEconomyCapacity(int capacity)
	{
		if(this.numEconomyPassengers == 0  && capacity >= 49)
		{
			this.economyCapacity = capacity;

			int ctr = 0;
			this.economySeats = new Seat[this.economyCapacity];
			for(int i=0; i<this.economyCapacity/7; i++)
			{
				for(int j=0; j<7; j++)
					this.economySeats[ctr++] = new Seat(((i+1)+""+(char)('A'+j)));
			}
		}
	}

	public void setBusinessClassCapacity(int capacity)
	{
		if(this.numBusinessClassPassengers == 0  && capacity >= 0)
		{
			this.businessClassCapacity = capacity;

			int ctrG = 0;
			this.businessClassSeats = new Seat[this.businessClassCapacity];
			for(int i=0; i<this.businessClassCapacity/4; i++)
			{
				for(int j=0; j<4; j++)
					this.businessClassSeats[ctrG++] = new Seat(((i+1)+""+(char)('W'+j)));
			}
		}
	}

	public boolean bookPassenger(Passenger passenger, String seatName, BookingType type)
	{
		boolean res = false;
		Seat seat = new Seat(seatName);
		if(seat.isAvailable())
		{
			
		}
		return res;
	}

	public ArrayList<Passenger> getAllEconomyPassengers()
	{
		return new ArrayList<Passenger>();
	}

	public ArrayList<Passenger> getAllBusinessClassPassengers()
	{
		return new ArrayList<Passenger>();
	}

	@Override
	public String toString()
	{
		String result = this.name + "\n\n";
		int ctr = 0;

		if(this.numEconomyPassengers + this.numBusinessClassPassengers == this.economyCapacity + this.businessClassCapacity)
		{
			result += "Fully Booked.";
		}
		else
		{
			if(businessClassCapacity > 0)
			{
				for(Seat s : this.businessClassSeats)
				{
					result += s + "  ";
					if(++ctr % 4 == 0)
						result += "\n";
				}
				result += "\n";
			}
			ctr = 0;
			for(Seat s : this.economySeats)
			{
				result += s + " ";
				if(ctr % 7 == 1 || ctr % 7 ==4)
					result += "  ";
				if(++ctr % 7 == 0)
					result += "\n";
			}
		}

		return result;
	}
}