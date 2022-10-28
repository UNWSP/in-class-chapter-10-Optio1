
public class PizzaDelivery extends Pizza {
	public int deliveryFee;
	public PizzaDelivery(int pr, String des) {
		super(pr, des);
		if (pr > 15) {
			this.deliveryFee = 3;
		}
		else {
			this.deliveryFee = 5;
		}
	}
	
	public String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDeliveryFee() {
		return deliveryFee;
	}
	public void setDeliveryFee(int deliveryFee) {
		this.deliveryFee = deliveryFee;
	}
	public void display(){
		super.display();
		System.out.println("Delivery Fee: " + deliveryFee + " address: " + address);
	}
}
