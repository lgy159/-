package GitTeam;

public class ProductTest {

	public static void main(String[] args) {

	}
}

abstract class Product {
	private double price;

	Product() {

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract String getName();
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

class Laptop {
	double totalCapacity;
	double usedCapacity;

	Laptop() {

	}

	public double getFreeCapacity() {
		return 5;
	}

	public void format() {

	}

	public boolean isConnected() {
		return true;
	}

	public double maxSpeed() {
		return 10.00;
	}

	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		this.usedCapacity = usedCapacity;
	}

	public String getName() {
		return getClass().getName();
	}
}

interface DataStorage {
	public double getFreeCapacity();

	public void format();
}

class SmartTV {
	private int channel;

	SmartTV() {

	}

	public boolean isConnected() {
		return true;
	}

	public double maxSpeed() {
		return 5;
	}

	public String getName() {
		return getClass().getName();
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

}