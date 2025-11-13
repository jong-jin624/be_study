package be_study.cls.cls04;

public class IpadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ipad ip1 = new Ipad();
		ip1.showInfo();
		
		Ipad ip2 = new Ipad();
		ip2.owner = "유재석";
		ip2.showInfo();
		
		ip2.returnCheck();
		
	}

}
