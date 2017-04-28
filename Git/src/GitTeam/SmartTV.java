package GitTeam;

public class SmartTV extends Product implements Networked {

	private int channel;

	SmartTV() {

	}

	@Override
	public boolean isConnected() {
		return true;
	}

	@Override
	public double maxSpeed() {
		return 5;
	}

	@Override
	public String getName() {
		return getClass().getName();
	}

	public int getChannel() {
		if(channel <0)
		{
			System.out.println("Error ! invalid value : channel");
			return -1;
		}
		
		return channel;
	}

	public void setChannel(int channel) {
		if(channel <0)
		{
			System.out.println("Error ! invalid value : channel");
			return ;
		}
		this.channel = channel;
	}
	

}
