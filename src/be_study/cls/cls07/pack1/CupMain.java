package be_study.cls.cls07.pack1;

import java.util.Scanner;
import be_study.cls.cls07.pack2.Cup;

public class CupMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cup c1 = new Cup();
		be_study.cls.cls07.pack1.Cup c2 = new be_study.cls.cls07.pack1.Cup();
		
		Scanner scanner = new Scanner(System.in);
		
		Cup c5 = new Cup();
		be_study.cls.cls07.pack2.Cup c6 = new be_study.cls.cls07.pack2.Cup();
		
		c5.method();
		c6.method();
		
		c6.type = "플라스틱";
	}

}
