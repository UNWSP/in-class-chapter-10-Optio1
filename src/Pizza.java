
public class Pizza {
	public String description;
	public int price;
	public Pizza(int pr, String des) {
		this.price=pr;
		this.description=des;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void display() {
		System.out.println("Price: " + this.price + " Description: " + this.description);
	}
	
	
}
