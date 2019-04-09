import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class ShoppingCartTest {
	
	ShoppingCart sctest = new ShoppingCart();
	
	@Test
	public void testAdditem(){//tests for incrementation when item is added
		int initialsize = sctest.getItemCount();
		sctest.addItem(new Product("p1",1.00));
		int postsize = sctest.getItemCount();
		assertTrue("Adding an item works correctly", (initialsize < postsize));
	}
	
	@Test
	public void testRemoveItem() throws ProductNotFoundException{//tests for decrementation when item is removed
		int initialsize = sctest.getItemCount();
		sctest.removeItem(new Product("p1",1.00));
		int postsize = sctest.getItemCount();
		assertTrue("Removing an item works correctly", (initialsize < postsize));
	}

}
