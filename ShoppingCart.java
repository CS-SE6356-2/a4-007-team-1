import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

import junit.*;

public class ShoppingCart {
	
	private ArrayList items;
	
	public ShoppingCart() {
		items = new ArrayList(0);
	}
	
	public double getBalance() {
		double balance = 0.00;
		for (Iterator i = items.iterator(); i.hasNext();){
			Product item = (Product)i.next();
			balance += item.getPrice();
		}
		return balance;
	}
	
	
	public void addItem(Product item) {
		items.add(item);
	}
	
	public void removeItem(Product item)
			throws ProductNotFoundException {
		if (!items.remove(item)) {
			throw new ProductNotFoundException();}
		else {
			items.remove(item);}//Actually removes the item if it exists
	}
	
	public int getItemCount() {
		return items.size();
	}
	
	public void empty() {
		items.clear();
	}
	
	
	
}


