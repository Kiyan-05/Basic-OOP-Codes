class Customer
{
	public String name;
	public Cart userCart;
	//public Order customerOrder;

	public Customer()
	{
		this.name = null;
		//this.customerOrder = null;
		this.userCart = null;
	}

	public Customer(String name, Cart c)
	{
		this.name = name;
		//this.customerOrder = this.o;
		this.userCart = c;
	}

	@Override
	public String toString()
	{
		return ("\n" + this.name + " Cart: " + "\n" + this.userCart);
	}
}