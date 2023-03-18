

class Product
{
	public String name;
	public double price;

	public Product()
	{
		this.name = null;
		this.price = 0.0;
	}

	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean equals(Object o)
	{
		return o!= null && o instanceof Product && ((Product)o).name.equals(this.name);
	}

	@Override
	public int hashCode()
	{
		return this.name.hashCode();
	}

	@Override
	public String toString()
	{
		return ("Product: " + this.name + " -- " + this.price + " each.");
	}
}