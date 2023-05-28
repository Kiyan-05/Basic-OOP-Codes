public abstract class Item implements ItemComparable
{
	private static int numberOfItems = 0;
	private int id;
	private int value;
	private String name;
	private double weight;

	public Item(String name, int value, double weight)
	{
		this.id = numberOfItems;
		numberOfItems++;
		this.name = name;
		this.value = value;
		this.weight = weight;
	}

	public abstract void use();

	@Override
	public int compareByValue(Item item)
	{
		return this.value - item.value;
	}

	@Override
	public int compareByWeight(Item item)
	{
		if(this.weight > item.weight)
			return 1;
		else if(this.weight < item.weight)
			return -1;
		else if(this.weight == item.weight);
			return 0;
	}

	public int getID(){ return this.id;}

	public int getValue(){ return this.value;}

	public String getName(){ return this.name;}

	public double getWeight(){ return this.weight;}

	public void setValue(int value)
	{
		this.value = value;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}
}