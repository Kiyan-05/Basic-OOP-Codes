public class Seat
{
	public String seatNumber;
	public Passenger passenger;

	public Seat(String seatNumber)
	{
		this.seatNumber = seatNumber;
	}

	public Seat(Passenger p)
	{
		this.passenger = p;
		this.seatNumber = p.chosenSeat;
	}

	public void addPassengerSeat(Passenger p, int num)
	{
		boolean res = false;
		for(int i=0; i<this.passenger.reservedSeats.length; i++)
		{
			for(int j=0; j<this.passenger.reservedSeats[i].length; j++)
				if (p.chosenSeat.equals(this.passenger.reservedSeats[i][j]))
					res = true;
		}
		if(res==false)
			this.passenger.reservedSeats[num][num] = p.chosenSeat;
	}
	
	@Override
	public String toString()
	{
		return (this.seatNumber + " ");
	}
}