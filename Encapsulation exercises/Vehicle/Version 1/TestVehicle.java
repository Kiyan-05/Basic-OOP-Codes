public class TestVehicle
{
	public static void main(String[] args) 
	{	
		Vehicle car = new Vehicle(10000);
		car.addLoad(500);
		car.addLoad(250);
		car.addLoad(5000);
		car.addLoad(4000);
		car.addLoad(300);

		System.out.println(car);
	}
}