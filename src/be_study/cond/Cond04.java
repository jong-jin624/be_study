package be_study.cond;

public class Cond04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int goBedTime = 21; // 자러간 시간
		int sleepTime = 9; // 수면시간
		
		if(goBedTime <= 21) { // 일찍
			if(sleepTime > 8) { // 많이
				System.out.println("일찍 많이");
			} else { // 적게
				System.out.println("일찍 적게");
			}		
		} else { // 늦게
			if(sleepTime > 8) { // 많이
				System.out.println("늦게 많이");
			} else { // 적게
				System.out.println("늦게 적게");
			}
		}
		
		if(goBedTime <= 21 && sleepTime > 8) {
			System.out.println("일찍 많이");
		}
		
		
	}

}
