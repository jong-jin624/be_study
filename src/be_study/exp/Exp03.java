package be_study.exp;

import java.util.List;

public class Exp03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleEx s = new SampleEx();

		try {
			s.addItem1("하나");
		} catch (Exception e) {
			System.out.println("addItem1을 호출한 main에서 하나 예외처리");
		}

		try {
			s.addItem1("둘");
		} catch (Exception e) {
			System.out.println("addItem2을 호출한 main에서 하나 예외처리");
		}

		try {
			s.addItem3("셋");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("addItem3을 호출한 main에서 하나 예외처리");
		}

		try {
			s.addItem4("넷");
		} catch (NullPointerException e) {
			System.out.println("addItem4을 호출한 main에서 넷 예외처리");
		}

		try {
			s.addItem5("다섯");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("SampleEx 내부 addItem5에서 예외처리");
		}

		try {
			s.addItem6("여섯");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("SampleEx 내부 addItem6에서 예외처리");
		}
		
		int result = s.addItem7("일곱");
		if(result == 1) {
			
		} else {
			
		}
		
		try {
			s.addItem8("여덟");
		} catch (InvalidParameterValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ListFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			s.addItem8("여덟");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class SampleEx {

	List<String> list;

	void addItem1(String s) {
		list.add(s);
	}

	void addItem2(String s) {
		try {
			list.add(s);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("SampleEx 내부 addItem2에서 예외처리");
		}
		// 흠..
	}

	void addItem3(String s) throws Exception {
		list.add(s);
	}

	void addItem4(String s) throws NullPointerException {
		list.add(s);
	}

	void addItem5(String s) throws Exception {
		try {
			list.add(s);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("SampleEx 내부 addItem5에서 예외처리");
		}
	}

	void addItem6(String s) throws Exception {
		try {
			list.add(s);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("SampleEx 내부 addItem6에서 예외처리");
			throw e; // 실제 예외를 던진다.
		}
	}
	
	int addItem7(String s) {
		try {
			list.add(s);
		} catch (Exception e) {
			// TODO: handle exception
			return -1;
		}
		return 1;
		
	}
	
	void addItem8(String s) throws InvalidParameterValueException, ListFullException {
		if( s== null) {
			throw new InvalidParameterValueException();
		}
		try {
			list.add(s);
		} catch (Exception e) {
			throw new ListFullException();
		}
	}
}


class ListFullException extends Exception {}

class InvalidParameterValueException extends Exception {}

class SuperVeryThirstyException extends Exception {}