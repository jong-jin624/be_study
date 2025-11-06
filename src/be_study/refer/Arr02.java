package be_study.refer;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10; // ㅁ
		int[] nArr1 = new int[5]; // ㅁㅁㅁㅁㅁ
		
		int[][] nArr2 = new int[3][5];
/*		0 12 3 4
  	0	ㅁㅁㅁㅁㅁ
	1	ㅁㅁㅁㅁㅁ
	2	ㅁㅁㅁㅁㅁ

*/
		
		int[][] nArr3 = new int[4][3];
/*
					ㅁㅁㅁ
					ㅁㅁㅁ <- nArr3[1][2]
					ㅁㅁㅁ
	nArr3[3][0]	->  ㅁㅁㅁ
*/
		
		int[] nArray1 = {1,2,3,4,5,6};
		System.out.print(nArray1[0] + " ");
		System.out.print(nArray1[1] + " ");
		System.out.print(nArray1[2] + " ");
		
		System.out.println();
		
		int[][] nArray2 = { {1,2,3}, {4,5,6} };
		// ㅁㅁㅁ  1 2 3
		// ㅁㅁㅁ  4 5 6
		
		int[][] nArray3 = { {1,2}, {3,4}, {5,6} };
		//	ㅁㅁ		1 2
		//	ㅁㅁ		3 4
		//	ㅁㅁ		5 6
		
		System.out.println(nArray2[0][2]);
		
		int[][] nArray4 = new int [2][3];
		
		for(int i=0; i<2; i++) {
			for (int j = 0; j<3; j++) {
				System.out.print(nArray2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
