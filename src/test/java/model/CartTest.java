package model;

import static org.junit.Assert.*;
import org.junit.Test;

public class CartTest {

	@Test
	public void shouldCalculateTotalPrice() throws Exception {
		Cart cart = new Cart();
		Product p1 = new Product("Apple", new Money(2));
		Product p2 = new Product("Orange", new Money(5));
		cart.addProduct(p1, 3);
		cart.addProduct(p2, 4);
		assertEquals(new Money(26), cart.totalPrice());
	}
}
