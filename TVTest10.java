package objectsAndClasses10;

public class TVTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV10 t1 = new TV10();
		System.out.println("Channel: " + t1.channel + " Volume: " + t1.volume + " On: " + t1.on);
		t1.switchOn();
		t1.channelUp();
		t1.volumeDown();
		System.out.println("Channel: " + t1.channel + " Volume: " + t1.volume + " On: " + t1.on);
	}

}
