
public class TestPizza {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza(10, "a good pizza");
		pizza1.display();
		PizzaDelivery pizza2 = new PizzaDelivery(16, "a better pizza");
		pizza2.setAddress("An address");
		pizza2.display();
		

	}

}
