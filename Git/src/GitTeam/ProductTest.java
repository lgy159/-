package GitTeam;

public class ProductTest {

	public static void main(String[] args) {

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


