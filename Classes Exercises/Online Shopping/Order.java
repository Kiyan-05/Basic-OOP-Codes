
class Order
{
	public Customer customer;

	public Order()
	{
		this.customer = null;
	}

	public Order(Customer c)
	{
		this.customer = c;
	}

	public void purchase(Customer c)
	{
		
	}

	@Override
	public String toString()
	{
		return (this.customer + this.cart);
	}
}