package be_study.refer;

public class Arr05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < 5; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		System.out.println();

		int index = 0;
		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();

		
		int[] scores = {90, 95, 100, 85, 80};
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}System.out.println(sum);
		
		sum = 0;
		for(int s : scores) {
			sum = sum + s;
		}System.out.println(sum);
		
		
		for(int s : scores) {
			System.out.print(s + " ");
		}System.out.println();
		

		for(int s : scores) {
			s -= 5;
			
		}
//		for(int i=0; i<scores.length; i++) {
//			scores[i] = scores[i] - 5;
//		}
		
		for(int s : scores) {
			System.out.print(s + " ");
		}System.out.println();
		
		
	}

}
