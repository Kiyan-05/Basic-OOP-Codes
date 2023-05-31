package pizzeria;
import java.util.*;

public class FruitShake implements PricedItem
{
	private ShakeSize size;

	private ArrayList<Fruit> fruits;

	public FruitShake(ShakeSize size)
	{
		this.size = size;
		this.fruits = new ArrayList<Fruit>();
	}

	public void addFruit(Fruit fruit)
	{
		this.fruits.add(fruit);
	}

	public ArrayList<Fruit> getFruits()
	{
		return new ArrayList<Fruit>(this.fruits);
	}

	public ShakeSize getSize()
	{
		return this.size;
	}

	@Override
	public double computePrice()
	{
		double price = 40;

		for(int i=0; i<this.fruits.size(); i++)
		{
			price += this.fruits.get(i).getCost();
		}

		if(this.size == ShakeSize.Medium)
		{
			price *= 1.45;
		}
		else if(this.size == ShakeSize.Large)
		{
			price *= 1.85;
		}
		else if(this.size == ShakeSize.Small)
		{
			price *= 1;
		}

		return price;
	}
}