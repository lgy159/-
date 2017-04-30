package GitTeam;

public class ProductTest {

	public static void main(String[] args) {

		// 노트북
		Laptop la = new Laptop();
		DataStorage la2 = la;
		Networked la3 = la;

		// tv
		SmartTV tv = new SmartTV();
		Networked tv2 = tv;

		// 토스터
		Toaster to = new Toaster();
		Cooker to2 = to;

		// 노트북 관련 메소드
		testProduct(la);
		testDataStorage(la2);
		testNetworked(la3);

		System.out.println("");
		// tv 관련 메소드
		testProduct(tv);
		testNetworked(tv2);

		System.out.println("");
		// 토스터 관련 메소드
		testProduct(to);
		testCooker(to2);

	}

	public static void testProduct(Product p) {
		System.out.println("Name " + p.getName());
		p.setPrice(5000);
		System.out.println("Price " + p.getPrice());

	}

	public static void testDataStorage(DataStorage d) {
		System.out.println("Free Capacity : " + d.getFreeCapacity());
		d.format();
	}

	public static void testNetworked(Networked n) {

		System.out.println("Connect : " + n.isConnected());
		System.out.println("Max Speed : " + n.maxSpeed());
	}

	public static void testCooker(Cooker c) {
		System.out.println(c.preparedFood());
	}

}
