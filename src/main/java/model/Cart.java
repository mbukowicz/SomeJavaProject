package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<CartItem> items = new ArrayList<CartItem>();
	
	public void addProduct(Product product, int quantity) {
		items.add(new CartItem(product, quantity));
	}
	
	public Money totalPrice() {
		Money total = new Money(BigDecimal.ZERO);
		for (CartItem item : items) {
			Money subtotal = item.getProduct().getPrice().multiply(item.getQuantity());
			total = total.add(subtotal);
		}
		return total;
	}
}
