
// In this class we test the code given to us for Assignment 4


import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
	
	
	// Testing ShoppingCart object
	private ShoppingCart test;
	
	
	// Initialization of the test object
	@BeforeEach
	public void setUp()
	{
		test = new ShoppingCart();
	}

	
	// This test here is designed to implement the JUnit test unit and confirm that the shopping cart does indeed
	// have zero items when created (when constructor is called)
	@Test
	public void shouldCreatEmpty() 
	{
		// Create test object and see if it is empty.
		assertEquals(test.getItemCount(), 0);
	}
	
	
	// This test here is designed to implement the JUnit test unit and confirm that the shopping cart does indeed
	// have zero items when emptied (empty function is called)
	@Test
	public void shouldEmptyProper() 
	{
		// Create test object, populate and then empty
		test.addItem(new Product("A", 1.00));
		test.addItem(new Product("B", 2.00));
		test.addItem(new Product("C", 3.00));
		test.empty();
		assertEquals(test.getItemCount(), 0);
	}
	
	
	// This test here is designed to implement the JUnit test unit and confirm that the item count increments
	@Test
	public void itemsShouldIncrement()
	{        
	    // adds a new item to the cart
	    test.addItem(new Product("P", 25.50));
	    
	    // test to see if the final number is equal to 1 (only one added in)
	    assertEquals(test.getItemCount(), 1);
	}
	
	
	// This test here is designed to implement the JUnit test unit and confirm that the balance total changes
	// as an item is added
	@Test
	public void balanceShouldAdd()
	{    
	    // get the current balance and create an arbitrary value
	    double balance = test.getBalance();
	    double P = 25.50;
	    
	    // adds a new item to the cart
	    test.addItem(new Product ("P", 25.50));
	    
	    // test to see if new balance = old balance plus new item
	    assertEquals(test.getBalance(), balance + P);
	}
	
	
	// This test here is designed to implement the JUnit test unit and confirm that the item count decreases
	// when an item is removed from the cart
	@Test
	public void itemsShouldDecrement()
	{        
	    // adds a new item to the cart
	    test.addItem(new Product("P", 25.50));
	    Product testProd = new Product("B", 15.00);
	    test.addItem(testProd);
	    
	    // Save current count
	    int count = test.getItemCount();
	    
	    // test to see if the count decrements
	    try 
	    {
			test.removeItem(testProd);
			assertEquals(test.getItemCount(), count - 1);
		} 
	    catch (ProductNotFoundException e) 
	    {
			// Should never reach here
			fail();
	    }
	}
	
	
	// This test here is designed to implement the JUnit test unit and confirm that the exception is thrown
	@Test
	public void exceptionShouldThrow()
	{        
	    // Create item to be removed
	    Product testProd = new Product("A", 1.00);

	    
	    // Test to see if the exception is thrown
	    try 
	    {
			test.removeItem(testProd);
			fail("This should not be reached");
		} 
	    catch (ProductNotFoundException e) 
	    {
	    	// This means the test succeeds
	    }
	}
}
