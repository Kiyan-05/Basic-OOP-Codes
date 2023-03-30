public class Student
{
	private int id;
	private String last_name;
	private String first_name;

	public Student(int id, String last_name, String first_name)
	{
		this.id = id;
		this.last_name = last_name;
		this.first_name = first_name;
	}

	@Override
	public String toString()
	{
		return this.id + " | " + this.last_name + ", " + this.first_name;
	}
}