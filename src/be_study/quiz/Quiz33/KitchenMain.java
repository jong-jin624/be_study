package be_study.quiz.Quiz33;

public class KitchenMain {
	public static void main(String[] args) {

		KitchenSize kitchen = new KitchenSize();
		kitchen.space= 12;
		kitchen.wallpaperColor = "그레이";
		kitchen.height = 250;

		Frige frige = new Frige();
		frige.brand = "LG";
		frige.literSize = 600;
		frige.doorCount = 3;

		Ice ice = new Ice();
		ice.Count = 12;
		ice.price = 5000;

		frige.iceTray = ice;
		kitchen.frige = frige;

		GasRange gas = new GasRange();
		gas.fireCount = 3;
		gas.brand = "린나이";
		gas.price = 150000;

		kitchen.gasRange = gas;

		Sink sink = new Sink();
		sink.width = 120;
		sink.height = 90;
		sink.deep = 50;
		sink.color = "실버";
		sink.material = "스테인리스";

		kitchen.sink = sink;

		TrashCan t1 = new TrashCan();
		t1.liter = 20;
		t1.color = "블랙";
		t1.sizeMuch = 50;

		TrashCan t2 = new TrashCan();
		t2.liter = 15;
		t2.color = "화이트";
		t2.sizeMuch = 30;

		kitchen.TrashCan = new TrashCan[] { t1, t2 };

		Cup c1 = new Cup();
		c1.size = 350;
		c1.material = "유리";
		c1.color = "투명";

		Cup c2 = new Cup();
		c2.size = 500;
		c2.material = "플라스틱";
		c2.color = "블루";

		kitchen.Cup = new Cup[] { c1, c2 };

		System.out.println("KitchenSize 구성 완료!");
	}
}
