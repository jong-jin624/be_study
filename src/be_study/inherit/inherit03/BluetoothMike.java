package be_study.inherit.inherit03;

public class BluetoothMike extends Mike {

	boolean isConnected;
	int battery;

	public void connect() {

	}

	// 메소드 재정의 오버라이딩
	public void volumeUp() {
		System.out.println("BluetoothMike 재정의 volumeUp()");
	}

	public void volumeUp(int v) {
		System.out.println(v + "만큼 볼륨업!");
	}

}
