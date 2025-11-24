package be_study.inherit.inherit04;

import be_study.inherit.inherit03.BluetoothMike;
import be_study.inherit.inherit03.Mike;
import be_study.inherit.inherit03.WirelessMike;

public class Inherit04Main {

	public static void main(String[] args) {
		Mike m1 = new Mike();
		BluetoothMike bm1 = new BluetoothMike();
		WirelessMike wm1 = new WirelessMike();

		Mike m2 = bm1;
		Mike m3 = wm1;

		Mike m4 = new BluetoothMike();
		Mike m5 = new WirelessMike();

		m4.volumeUp();
		m5.volumeUp();

		int[] intArr = { 1, 2, 3, 4 };

		Mike[] arr = { m1, bm1, wm1 };
		Mike[] arr2 = { new Mike(), new BluetoothMike(), new WirelessMike() };
		Mike[] arr3 = new Mike[3];
		arr3[0] = new Mike();
		arr3[1] = new BluetoothMike();
		arr3[2] = new WirelessMike();
	}
}
