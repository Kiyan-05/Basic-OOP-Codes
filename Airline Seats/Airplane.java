public class Airplane
{
	public String name;
	public Seat[][] seats;

	public Airplane(String name)
	{
		this.name = name;
		this.seats = new Seat[7][];
		for(int i=0; i<this.seats.length; i++)
		{
			this.seats[i] = new Seat[4];
			for(int j=0; j<this.seats[i].length; j++)
				this.seats[i][j] = new Seat((i+1)+""+(char)('A'+ j));
		}
	}

	public void choosenSeat(Passenger passenger)
	{
		for(int i=0; i<this.seats.length; i++)
		{
			for(int j=0; j<this.seats[i].length; j++)
				if (this.seats[Integer.parseInt(String.valueOf(passenger.chosenSeat.charAt(0)))-1][passenger.chosenSeat.charAt(1)-'A'].passenger == null && this.seats[Integer.parseInt(String.valueOf(passenger.chosenSeat.charAt(0)))-1][passenger.chosenSeat.charAt(1)-'A'] == this.seats[i][j])
					this.seats[i][j] = new Seat(passenger.seatValue);
		}
	}

	public boolean isSeatValid(Passenger passenger)
	{
		boolean res = true;
		String[] val = passenger.chosenSeat.split("",2);
		if(this.seats[Integer.parseInt(String.valueOf(passenger.chosenSeat.charAt(0)))-8][passenger.chosenSeat.charAt(1)-'E'] == val[0])
			res = false;
		return res;
	}

	public boolean isSeatChosen(Passenger passenger)
	{
		boolean pick = false;
		for(int i=0; i<this.seats.length; i++)
		{
			for(int j=0; j<this.seats[i].length; j++)
				if(passenger.chosenSeat.equals(passenger.reservedSeats[i][j]))
					pick = true;
		}
		return pick;
	}

	@Override
	public String toString()
	{
		String res = "\nIn Airplane " + this.name + "\nSeats Available: \n";
		for(int i=0; i<this.seats.length; i++)
		{
			for(int j=0; j<this.seats[i].length; j++)
				res +=(this.seats[i][j]);
			res += "\n";
		}
		return res;
	}
}