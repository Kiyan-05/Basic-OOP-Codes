class Customer
{
	public String name;
	public Cart userCart;
	public double currentBalance;

	public Customer()
	{
		this.name = null;
		//this.customerOrder = null;
		this.userCart = null;
	}

	public Customer(String name, Cart c)
	{
		this.name = name;
		this.userCart = c;
	}

	public Customer(Customer c, double amount)
	{
		this.name = c.name;
		this.userCart = c.userCart;
		this.currentBalance = amount;
	}

	@Override
	public String toString()
	{
		return ("\n" + this.name + " Cart: " + "\n" + this.userCart);
	}
}