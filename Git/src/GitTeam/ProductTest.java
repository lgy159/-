package GitTeam;

public class ProductTest {

	public static void main(String[] args) {

		Product la = new Laptop();
		Product tv = new SmartTV();
		Product to = new Toaster();

		DataStorage la2 = new Laptop();
		
		Networked la3 = new Laptop();
		Networked tv2 = new SmartTV();
		
		Cooker to2 = new Toaster();
		
	}

	public void testProduct(Product p) {
		p.setPrice(5000);
		System.out.println(p.getPrice());
		System.out.println(p.getName());
	}

	public void testDataStorage(DataStorage d) {
		System.out.println(d.getFreeCapacity());
		d.format();
	}

	public void testNetworked(Networked n) {

		System.out.println(n.isConnected());
		System.out.println(n.maxSpeed());
	}

	public void testCooker(Cooker c) {
		System.out.println(c.preparedFood());
	}

}

interface Cooker {
	public String preparedFood();
}

class Toaster extends Product implements Cooker {
	Toaster() {

	}

	public String preparedFood() {
		return "preparedFood";
	}

	public String getName() {
		return getClass().getName();
	}
}

interface DataStorage {
	public double getFreeCapacity();

	public void format();
}
