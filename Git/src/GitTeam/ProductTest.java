package GitTeam;

public class ProductTest {

	public static void main(String[] args) {
		ProductTest test = new ProductTest();
		Product p = new SmartTV();		
		Cooker c = new Toaster();
		DataStorage d = new Laptop();
		Networked n = new Laptop(); 
		
		test.testProduct(p);
		test.testDataString(d);
		test.testNetworked(n);
		test.testCooker(c);
	}
	
	ProductTest(){
		
	}
	
	public void testProduct(Product p){
		SmartTV tv = new SmartTV();
		System.out.println(tv.getName());
		p.setPrice(4.5);
		tv.setPrice(p.getPrice());
		System.out.println("SmartTV Price : "+tv.getPrice()+"$");
		tv.setChannel(5);
		System.out.println("TV channel : "+tv.getChannel());
		System.out.println();
	}
	
	public void testDataString(DataStorage d){
		Laptop la = new Laptop();
		la.setTotalCapacity(100);
		la.setUsedCapacity(30);
		System.out.println(la.getName());
		System.out.println("TotalCapacity : "+la.getTotalCapacity());
		System.out.println("UsedCapacity : "+la.getUsedCapacity());
		System.out.println("FreeCapacity : "+d.getFreeCapacity());
		d.format();
		System.out.println();
	}
	
	public void testNetworked(Networked n){
		Laptop la = new Laptop();
		System.out.println(la.getName()+" is "+n.isConnected());
		System.out.println(la.getName()+" maxSpeed is "+n.maxSpeed());
		System.out.println();
	}
	public void testCooker(Cooker c){
		Toaster t = new Toaster();
		System.out.println(t.getName());
		System.out.println(t.getName()+" is "+c.preparedFood());
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
