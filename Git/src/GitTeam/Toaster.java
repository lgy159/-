package GitTeam;

public class Toaster extends Product implements Cooker {
	Toaster() {

	}

	public String preparedFood() {
		return "preparedFood";
	}

	public String getName() {
		return getClass().getName();
	}
}