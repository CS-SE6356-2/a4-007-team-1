import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

@Test

public class TestBalance{
    ShoppingCart test = new ShoppingCart();
    // get the current balance
    double balance = Cart.getBalance();
    double P = 25.50;
    // adds a new item to the cart
    test.addItem(new Product ("P", 25.50))
    // test to see if new balance = old balance plus new item
    assertEquals(test.getBalance(), balance + P);
}
