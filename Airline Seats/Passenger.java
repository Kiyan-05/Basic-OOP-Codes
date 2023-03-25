public class Passenger
{
	public String name;
	public String chosenSeat;
	public String[][] reservedSeats;
	public String seatValue;

	public Passenger(String name)
	{
		this.name = name;
		this.seatValue = " X ";
		this.reservedSeats = new String[7][4];
	}

	@Override
	public String toString()
	{
		String res = "\nPassenger " + this.name + "\nReserved Seats: \n";
		for(int i=0; i<this.reservedSeats.length; i++)
		{
			for(int j=0; j<this.reservedSeats[i].length; j++)
				res +=(this.reservedSeats[i][j]);
			res += ", ";
		}
		return res;
	}
}