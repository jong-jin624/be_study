package be_study.quiz;

public class Quiz19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열과 인덱스 조정하기.
		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
		//규칙을 찾아서 중첩된 반복문을 활용하여 값을 저장하고
		//아래와 같이 4*4 형태로 출력하시오.

		System.out.println("1.");	
//		1 2   3   4
//		5 6   7   8
//		9 10 11 12
//		13 14 15 16

		int [][] arr1 = new int [4][4];
		int num = 1;


		for (int i = 0; i <arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = num;
				num++;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.printf("%3d", arr1[i][j]);
			}
			System.out.println();
		} System.out.println();
		System.out.println();
		
		System.out.println("2.");	
//		1 5  9  13
//		2 6 10 14
//		3 7 11 15
//		4 8 12 16

		int [][] arr2 = new int [4][4];
		int num2 = 1;


		for (int j = 0; j < 4; j++) {      
		    for (int i = 0; i < 4; i++) {  
		        arr2[i][j] = num2++;
		    }
		}

		
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 4; j++) {
		        System.out.printf("%3d", arr2[i][j]);
		    }
		    System.out.println();
		}System.out.println();
		System.out.println();

		
		
		System.out.println("3.");		
//		16 15 14 13
//		12 11 10 9
//		8   7   6  5
//		4   3   2  1

		int [][] arr3 = new int [4][4];
		int num3 = 16;
		
		for (int i = 0; i <arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = num3;
				num3--;
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.printf("%3d", arr3[i][j]);
			}
			System.out.println();
		} System.out.println();
		System.out.println();
		
		
		System.out.println("4.");
//		16 12 8 4
//		15 11 7 3
//		14 10 6 2
//		13 9  5  1
		
		int [][] arr4 = new int [4][4];
		int num4 = 16;


		for (int j = 0; j < 4; j++) {      
		    for (int i = 0; i < 4; i++) {  
		        arr4[i][j] = num4--;
		    }
		}

		
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 4; j++) {
		        System.out.printf("%3d", arr4[i][j]);
		    }
		    System.out.println();
		} 
	}

}
