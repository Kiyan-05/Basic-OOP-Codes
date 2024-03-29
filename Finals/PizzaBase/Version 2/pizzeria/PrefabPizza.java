package pizzeria;
import java.util.*;

public class PrefabPizza extends Pizza
{
	private double price;

	public PrefabPizza(String name, PizzaSize size, PizzaBase base, double price)
	{
		super(name, size, base);
		this.price = price;
	}

	@Override
	public double computePrice()
	{
		return this.price;
	}
}