public class Airplane
{
	private String name;
	private Seat[][] seats;

	public Airplane(String name)
	{
		this.name = name;
		this.seats = new Seat[7][];
		for(int i=0; i<this.seats.length;i++)
		{
			this.seats[i] = new Seat[4][];
			for(int j=0; j<this.seats[i].length; j++)
				this.seats[i][j] = new Seat((i+1)+""+(char)('A'+j));
		}
	}

	public void bookSeat(String chosenSeat)
	{

	}

	public boolean isSeatValid(String chosenSeat)
	{
		boolean res = true;
	}

	
}