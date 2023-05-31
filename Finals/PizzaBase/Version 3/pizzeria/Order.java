package pizzeria;
import java.util.*;

public class Order
{
	private ArrayList<PricedItem> pricedItems;

	public Order()
	{
		this.pricedItems = new ArrayList<PricedItem>();
	}

	public void addPricedItem(PricedItem item)
	{
		this.pricedItems.add(item);
	}

	public int getNumOfPricedItems()
	{
		return this.pricedItems.size();
	}

	public PricedItem getPricedItem(int index)
	{
		return this.pricedItems.get(index);
	}

	public double computeTotalPayment()
	{
		double total = 0;
		for(int i=0; i<this.pricedItems.size(); i++)
		{
			total += this.pricedItems.get(i).computePrice();
		}
		return total;
	}
}