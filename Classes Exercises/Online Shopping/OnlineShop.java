import java.util.*;

class OnlineShop
{
	public static void main(String[] args)
	{
		Product pen = new Product("Ballpen", 10.00);
		Product pen1 = new Product("Ballpen", 15.00);
		Product paper = new Product("Intermediate pad", 34.99);
		Product bag = new Product("Acer Bag", 499.99);


		Cart c = new Cart();
		c.addToCart(pen);
		c.addToCart(paper);
		c.addToCart(bag);
		c.addToCart(pen1);

		Customer josh = new Customer("Josh", c);

		System.out.println(josh);
	}
}