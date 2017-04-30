package GitTeam;

abstract class Product {
	private double price;

	public double getPrice() {
		if (price < 0) {
			System.out.println("Error! invalid value : price");
			return -1;
		}
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			System.out.println("Error! invalid value : price");
			return;
		}
		this.price = price;
	}

	public String getName() {
		return getClass().getSimpleName();
	}

}