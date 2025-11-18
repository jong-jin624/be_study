package be_study.cls.cls10;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> sList = new ArrayList<String>();
		sList.add("A");
		sList.add("B");
		sList.add("C");
		sList.add("D");
		sList.add("E");
		sList.add("F");

		for (String s : sList) {
			System.out.print(s + " ");
		}
		System.out.println();

		for (int i = 0; i < sList.size(); i++) {
			System.out.print(sList.get(i) + " ");
		}
		sList.contains("B");
	}

}
