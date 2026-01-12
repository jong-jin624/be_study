package be_study.exp;

public class Exp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[3];
		
		try {
			arr = null;
			arr[5] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException catch block");
		} catch ( NullPointerException e) {
			System.out.println("NullPointerException catch block");
		}
		catch ( Exception e) {
			System.out.println("Exception catch block");
		}
	}

}
