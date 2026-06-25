package elite;
import mmcoe.stock;
import mmcoe.stock.broker;

public class TackStock {
	public static void main(String srgd[]) {
		Stock tisco = new stock();
		
		Holder h = StockSingleton.getStock();
		h.viewQuote();
		
		Broker b = StockSingleton.getStock();
		b.getQuote();
		
		Exchange x = StockSingleton.getStock();
		x.setQuote();
		
		System.out.println(h == b);
		System.out.println(b == x);
		
	}
	

}
