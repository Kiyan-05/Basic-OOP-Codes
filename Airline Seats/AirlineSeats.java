import java.util.*;

public class AirlineSeats
{
	public static void main(String[] args) 
	{
		Airline cebu = new Airline("Cebu Pacific", "09201948834");
		Airplane plane1 = new Airplane("Concorde");
		cebu.addPlane(plane1);

		System.out.println(plane1);

		Passenger user1 = new Passenger("User1");
		Seat seat = new Seat(user1);

		Scanner cs = new Scanner(System.in);
		Scanner yn = new Scanner(System.in);
		char vr = ' ';
		int ctr = 0;

		while(vr != 'n')
		{
			System.out.print("Please choose an unoccupied seat location from(1A to 7D): ");
			user1.chosenSeat = cs.next();
			if(plane1.isSeatChosen(user1))
			{
				System.out.println("Error: Invalid input. (Range is 1A-7D.)");
			}
			else
			{
				plane1.choosenSeat(user1);
				seat.addPassengerSeat(user1,ctr);
				System.out.println(plane1);
				//System.out.println(user1.chosenSeat);
				//System.out.println(user1);
				System.out.print("Get another seat? [y|n]");
				vr = yn.next().charAt(0);
				ctr++;
			}
		}
	}
}