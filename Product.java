// This class contains the object description of what is contained in the ShoppingCart

public class Product 
{
	// Private attributes
	private String title;
	private double price;
	
	// Constructor
	public Product (String t, double p) 
	{
		this.title = t;
		this.price = p;
	}
	
	// Accessor methods
	public String getTitle() 
	{
		return title;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	// Comparator methods
	public boolean equals(Object o) 
	{
		if (o instanceof Product) 
		{
			Product p = (Product)o;
			return p.getTitle().equals(title);
		}
		return false;
	}
}

