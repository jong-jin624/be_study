package be_study.refer;

public class Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		배열 복사

//		int[] arr1 = { 10, 20, 30 };
//		int[] arr2 = arr1;
//
//		for (int i = 0; i < 3; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println();
//
//		for (int i = 0; i < 3; i++) {
//			System.out.print(arr2[i] + " ");
//		}
//		System.out.println();
//
//		arr2[0] = 99;
//
//		for (int i = 0; i < 3; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println();
//
//		for (int i = 0; i < 3; i++) {
//			System.out.print(arr2[i] + " ");
//		}
//		System.out.println();

		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = new int[3];

//		System.arraycopy(arr1, 0, arr2, 0, 3);
		System.arraycopy(arr1, 0, arr2, 1, 2);
		
		for (int i = 0; i < 3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// for문 복사
		for (int i = 0; i < 3; i++) {
//			arr2[i] = arr1[i];
			arr2[0] = 99;
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

}
