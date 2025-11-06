package be_study.refer;

public class Arr03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3};
		
		System.out.println( arr1[0] == arr1[2]);
		
		String[] arr2 = {"A", "B", "C"};
		System.out.println(arr2[0] == arr2[2]);
		
		System.out.println(arr2[0].equals(arr2[2]));
		
		String[][] arr3 = { {"A", "B", "C"}, {"D", "E", "F"} };
		
		System.out.println( arr3.length );
		System.out.println( arr3[0].length );
		
		System.out.println(arr3[0] == arr3[1]);
		// String은 arr3[0][0] == arr3[1][1] 이래도 주소비교
		// .equals arr3[0][0].equals(arr3[1][1]) 값비교
		
		int[][] arr4 = {{1,2,3}, {4,5,6}};
//		arr4[0] == arr4[1] 주소비교
//		arr4[0][0] == arr4[1][2] 값비교
	}

}
