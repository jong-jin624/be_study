package be_study.cond;

public class Cond03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dice = 5;
		
		if(dice == 1) {
			System.out.println("1칸 전진");
		} else {
			System.out.println("2칸 전진");
		}
		
		
		if(dice == 1) {
			System.out.println("1칸 전진");
		} else if (dice == 2) {
			System.out.println("2칸 전진");
		} else if (dice == 3) {
			System.out.println("3칸 전진");
		} else if (dice == 4) {
			System.out.println("4칸 전진");
		} else if (dice == 5) {
			System.out.println("5칸 전진");
		} else {
			System.out.println("6칸 전진");
		}
		
		// else if로 끝낼 때와 else로 끝낼 때 차이 1 ~ 6 
		// if문은 전부 실행될수도 있음.
		// else는 if에서 벗어나도 실행이 보장 돼있음 (무조건 실행)
		// else if는 조건이 벗어난다면 실행이 안됨 (만약 주사위가 7까지 있다면?)
		
		
		if (dice > 10) {}
		if (dice > 0 && dice <= 6) {}
		
		switch ( dice ) {
		case 1: // if(dice == 1)
			System.out.println("case 1");
			System.out.println("case 1");
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 4");
			break;
		case 5:
			System.out.println("case 5");
			break;
		case 6:
			System.out.println("case 6");
			break; // switch는 조건에 해당하면 전부 실행하기 떄문에 break;가 필요함
		default: // if/else문에 else에 해당(비슷함)
			System.out.println("default");
		}
		int showTime = 8; // 출근시간 
		
		if (showTime <= 8) {
			System.out.println("청소, 회의, 업무, 외근");
		} else if (showTime <= 9) {
			System.out.println("회의, 업무, 외근");
		} else if (showTime <= 10) {
			System.out.println("업무, 외근");
//		} else if (showTime <= 11) {
		} else {
			System.out.println("외근");
		}
		
		switch (showTime) {
		case 8:
			System.out.println("청소");
		case 9:
			System.out.println("회의");
		case 10:
			System.out.println("업무");
		case 11:
			System.out.println("외근");
		}
		
	}

}
