
class Order
{
	public Customer customer;
	public ModeOfPayment payment;

	public Order()
	{
		this.customer = null;
		this.payment = null;
	}

	public Order(Customer c, ModeOfPayment pay)
	{
		this.customer = c;
		this.payment = pay;
	}

	public double purchase(Customer c)
	{
		c.currentBalance -= totalAmount(c);
	}

	public double totalAmount(Customer c)
	{
		double total = 0;
		for(double d : c.userCart.products.price)
			total += d;
		return total;	
	}

	@Override
	public String toString()
	{
		return (this.customer + " will pay through " + this.payment + "\n" + customer.userCart);
	}
}