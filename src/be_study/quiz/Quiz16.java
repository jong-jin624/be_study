package be_study.quiz;

public class Quiz16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					arr[i][j] = 1;
				}
				if (i < j) {
					arr[i][j] = 2;
				}
				if (i > j) {
					arr[i][j] = 3;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			} System.out.println();
		}
	}
}
