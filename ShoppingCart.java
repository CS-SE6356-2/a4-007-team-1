
// This class is based on being a container for Product instances

import java.util.*;

import org.junit.*;

import junit.*;

public class ShoppingCart {
	
  
	// Private attributes
	private ArrayList<Product> items;
	
	
	// Default constructor
	public ShoppingCart() 
	{
		items = new ArrayList<Product>();
	}
	
	
	// Accessor methods
	public double getBalance() 
	{
		double balance = 0.00;
		for (Iterator<Product> i = items.iterator(); i.hasNext();){
			Product item = (Product)i.next();
			balance += item.getPrice();
		}
		return balance;
	}

	public int getItemCount() 
	{
		return items.size();
	}
	
	// Utility methods
	public void addItem(Product item) 
	{
		items.add(item);
	}
	
	public void removeItem(Product item) throws ProductNotFoundException 
	{
		if (!items.remove(item)) {
			throw new ProductNotFoundException();}
		else {
			items.remove(item);}//Actually removes the item if it exists
	}
	
	public void empty() 
	{
		items.clear();
	}
	
	
	
}


