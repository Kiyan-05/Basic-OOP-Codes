public class Seat
{
	public String seatNumber;
	public Passenger passenger;

	public Seat(String seatNumber)
	{
		this.seatNumber = seatNumber;
	}

	public Seat(Passenger p, String seatNumber)
	{
		this.passenger = p;
		this.seatNumber = seatNumber;
	}
	
	@Override
	public String toString()
	{
		return (this.seatNumber + " ");
	}
}