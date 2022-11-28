package example;

public class TestClass {
	public static void main(String[] args) {
		
		Store store=new Store();
		System.out.println("Store: "+store.apple);
		
		miniMarket m1 = new miniMarket();
		m1.min();
		
		maxMarket m2 = new maxMarket();
		m2.max();
		
		System.out.println("Store: "+store.apple);
	}
}
