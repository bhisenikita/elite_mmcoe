package mmcoe.ca;

public class ShoppingCart implements Shopping {
	private LinkedList<Product> items;
	
	
	public ShoppingCart() {
		items = new Product[5];
	}
	
	public void addToCart(Product p) throws ShoppingCartException {
		if(items.getSize() == 5) 
			throw new ShoppingCartException("your Cart is full");
		else {
			items.add(p);
			total += p.getPrice();
			
		}
	}
	
	public void checkOut() throws ShoppingCartException {
		if(items.getSize() == 0)
			throw new Exception("Your cart is empty!");
		
		items.print();
		System.out.println("Cart Total: " + total);
	}

}
