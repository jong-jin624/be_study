package be_study.cls.cls13;

public class AttendTool {

	boolean isPowerOn;
	String org;

	public boolean checkAttend(Card card) {

//		card.owner
		return true;
	}

	public int checkAttend2(Card card) {

//		card.owner
		return 1;
	}

	public boolean checkAttend(Card card, Student student) {

		if (student.name == card.owner) {
			return true;
		}
		return false;
	}

	public boolean checkAttend(Student student) {
		return true;

	}

	public void powerOn() {
		this.isPowerOn = true;
	}

}
