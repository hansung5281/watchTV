
public class TV {
	private boolean power;
	private int volume;
	private int channel;
		
	public TV(){
		
	}
	
	public TV(boolean power, int volume, int channel) {
		super();
		this.power = power;
		this.volume = volume;
		this.channel = channel;
	}

	


public boolean isPower() {
		return power;
	}



	public void setPower(boolean power) {
		this.power = power;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void powerOn(){
		power=true;
	}
	public void powerOff(){
		power=false;
	}
	
	public void channelUp(){
		channel++;
	}
	
	public void channelDown(){
		channel--;
	}
	
	public void volumeUp(){
		volume++;
	}
	public void volumeDown(){
		volume--;
	}
}
