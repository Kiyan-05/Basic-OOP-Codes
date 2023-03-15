import java.util.*;

class Cart
{
	public List<Product> products;

	public Cart()
	{
		this.products = new ArrayList<Product>();
	}

	public void addToCart(Product p)
	{
		this.products.add(p);
	}

	public void removeToCart(Product p)
	{
		this.products.remove(p);
	}

	@Override
	public String toString()
	{
		Set<Product> data = new HashSet<Product>(this.products);
		String result = " ";
		for(Product p : data)
		{
			result += "\t" + p + "\n\t\t Quantity: " + Collections.frequency(this.products, p) + "\n";
		}
		return result;
	}
}