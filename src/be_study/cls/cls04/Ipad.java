package be_study.cls.cls04;

public class Ipad {

//	String owner = "나";
	String owner;

	public void showInfo() {

		System.out.println("IPad 정보 출력====");
		System.out.println(owner + "의 아이패드입니다.");
		System.out.println("베터리 잔여량 : " + batteryNum());
	}

	int batteryNum() {
		
		return 80;
	}

	void returnCheck() {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			if(i==5) {
				return;
//				break;
			}
		}
//		break;
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
}
