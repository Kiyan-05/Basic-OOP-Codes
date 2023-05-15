public class Main
{
	public static void main(String[] args) 
	{
		/*
		Passenger p = new Passenger("Juan dela Cruz", true);
		System.out.println(p);
		Passenger p4 = new Passenger("Juan dela Cruz", true);
		System.out.println(p4.getName());
		Passenger p1 = new Passenger("Pedro", true);
		Passenger p2 = new Passenger("Pedro", false);
		System.out.println(p1.equals(p2));
		Passenger p5 = new Passenger("Juan dela Cruz", true);
		p5.isPWD = false;
		System.out.println(p5);
		*/
		/*
		Seat s = new Seat("1B");
		System.out.println(s);
		
		Seat s2 = new Seat("5F");
		System.out.println(s2);
		s2.setPassenger(new Passenger("Juan dela Cruz", false));
		System.out.println(s2);
		
		
		Seat s3 = new Seat("5F");
		System.out.println(s3.isAvailable());
		s3.setPassenger(new Passenger("Juan dela Cruz", false));
		System.out.println(s3.isAvailable());
		
		
		Seat s4 = new Seat("5F");
		s4.setPassenger(new Passenger("Juan dela Cruz", false));
		System.out.print(s4.getPassenger());
		s4.setPassenger(new Passenger("Lee Sun Shin", true));
		System.out.print(s4.getPassenger());
		*/
		Airplane a = new Airplane("VIP143");
		a.setBusinessClassCapacity(12);
		a.setEconomyCapacity(63);
		System.out.println(a);
	}
}