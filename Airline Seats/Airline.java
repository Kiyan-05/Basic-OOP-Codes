import java.util.*;

public class Airline
{
	public String name;
	public String contactNumber;
	public List<Airplane> planes;

	public Airline(String name, String contactNumber)
	{
		this.name = name;
		this.contactNumber = contactNumber;
		this.planes = new ArrayList<Airplane>();
	}

	public void addPlane(Airplane p)
	{
		this.planes.add(p);
	}

	public void removePlane(Airplane p)
	{
		this.planes.remove(p);
	}

	/*public boolean isSeatChosen(Airplane plane, Passenger passenger)
	{
		boolean pick = true;
		for(Seat[] i : plane.seats)
		{
			for(Seat e : i)
				if(passenger.chosenSeat.equals(e))
					pick = false;
		}
		return pick;
	}*/
}