package GitTeam;

public class Laptop extends Product implements Networked, DataStorage {

	private double totalCapacity;
	private double usedCapacity;

	@Override
	public double getFreeCapacity() {
		return 5;
	}

	@Override
	public void format() {
		System.out.println(getName() + " is formating");
	}

	@Override
	public boolean isConnected() {
		return true;
	}

	@Override
	public double maxSpeed() {
		return 10;
	}

	public double getTotalCapacity() {
		if (totalCapacity <= 0) {
			System.out.println("Error!! invalid value : totalCapacity");
			return 0;
		}
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		if (totalCapacity < 0) {
			System.out.println("Error!! invalid value : toalCapacity");
		}
		this.totalCapacity = totalCapacity;
	}

	public double getUsedCapacity() {
		if (usedCapacity < 0) {
			System.out.println("Error!! invalid value : usedCapacity");
			return 0;
		}
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		if (usedCapacity < 0) {
			System.out.println("Error!! invalid value : usedCapacity");
			return;
		}
		this.usedCapacity = usedCapacity;
	}

}
