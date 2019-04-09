import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

	
	// This test here is designed to implement the JUnit test unit and confirm that the shopping cart does indeed
	// have zero items when created (when constructor is called)
	@Test
	public void shouldCreatEmpty() 
	{
		// Create test object and see if it is empty.
		ShoppingCart test = new ShoppingCart();
		assertEquals(test.getItemCount(), 0);
	}
	
	
	// This test here is designed to implement the JUnit test unit and confirm that the shopping cart does indeed
	// have zero items when emptied (empty function is called)
	@Test
	public void shouldEmptyProper() 
	{
		// Create test object, populate and then empty
		ShoppingCart test = new ShoppingCart();
		test.addItem(new Product("A", 1.00));
		test.addItem(new Product("B", 2.00));
		test.addItem(new Product("C", 3.00));
		test.empty();
		assertEquals(test.getItemCount(), 0);
	}
}
