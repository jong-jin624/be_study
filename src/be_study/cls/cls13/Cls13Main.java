package be_study.cls.cls13;

public class Cls13Main {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "가이름";
		s1.stuNum = 1;
		s1.card = new Card(11, "체크", "가이름", "신한");

		Student s2 = new Student();
		s2.name = "나이름";
		s2.stuNum = 2;
		Card c2 = new Card(22, "신용", "나이름", "국민");
		s2.setCard(c2);

		AttendTool tool = new AttendTool();
		tool.isPowerOn = true;
		tool.powerOn();
		tool.org = "트레이닝 학원";

		boolean result = tool.checkAttend(c2);
		if (result) {

		} else {
			System.out.println("카드를 확인하거나, 다시 시도해주세요.");
		}

		int rs = tool.checkAttend2(c2);
		if (rs == 1) {
		} else if (rs == 2) {
		} else if (rs == 3) {
		} else {
		}
		
		result
	}
}