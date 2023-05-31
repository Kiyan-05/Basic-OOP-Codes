package pizzeria;
import java.util.*;

public class DIYPizza extends Pizza
{

	public DIYPizza(PizzaSize size)
	{
		super("DIY Pizza",size,PizzaBase.Original);
	}

	@Override
	public double computePrice()
	{
		double price = 0, basePrice = 100;

		for(int i=0; i<super.getToppings().size(); i++)
		{
			price += super.getToppings().get(i).getCost();
		}

		if(super.getSize() == PizzaSize.Double)
		{
			price *= 2;
			basePrice *=2;
		}
		else if(super.getSize() == PizzaSize.Barkada)
		{
			price *= 5;
			basePrice *=5;
		}
		else if(super.getSize() == PizzaSize.Single) 
		{
			price *= 1;
			basePrice *=1;
		}
		
		return price + basePrice;
	}
}