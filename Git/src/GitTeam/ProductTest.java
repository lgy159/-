package GitTeam;

public class ProductTest {

	public static void main(String[] args) {

	}

}

abstract class Product{
	private double price;
	private String name;
	
	Product(){
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void setName(String name){
		this.name = name;
	}
	public abstract String getName();
}

interface Cooker{
	public String preparedFood();
}

class Toaster extends Product implements Cooker{
	Toaster(){
		
	}
	
	public String preparedFood(){
		
	}
	
	public String getName(){
		return name;
	}
}

class Laptop{
	double totalCapacity;
	double usedCapacity;
	
	Laptop(){
		
	}
	
	public double getFreeCapacity(){
		
	}

	public void format(){
		
	}
	
	public boolean isConnected(){
		
	}
	
	public double maxSpeed(){
		
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
	
	public String getName(){
		
	}
}

interface DataStorage{
	public double getFreeCapacity();
	public void format();
}

class SmartTV{
	private int channel;
	
	SmartTV(){
		
	}
	
	public boolean isConnected(){
		
	}
	
	public double maxSpeed(){
		
	}
	public String getName(){
		
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
}