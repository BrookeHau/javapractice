package javapractice;

public class VendingItem {

	private double price;
	private String itemName;

	public VendingItem(double price, String itemName) {
		this.price = price;
		this.itemName = itemName;
	}

	public String getName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

}
