package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 3500;
		int l = 4100;
		int b = 4300;
		
		int[] menu = new int [10];
		int[] su = new int [10];
		int price = 0;
		int count = 0;
		int total = 0;
		
		while (true) {
            System.out.println("======== 메뉴 ========");
            System.out.println("1. 아메리카노    3500원");
            System.out.println("2. 카페라떼     4100원");
            System.out.println("3. 바닐라라떼    4300원");
            System.out.println("=====================");

            System.out.print("메뉴 선택 : ");
            menu[count] = scanner.nextInt();
            System.out.print("수량 선택 : ");
            su[count] = scanner.nextInt();
            scanner.nextLine(); 

            count++; 

            System.out.print("추가 주문하시겠습니까?(y/n) : ");
            String cho = scanner.nextLine();
            System.out.println();
            if (cho.equals("y") == false) {
                break;
            }
        }
		System.out.println();
        System.out.println("=====================");

        for (int j = 0; j < count; j++) {
            if (menu[j] == 1) {
                price = a * su[j];
                System.out.printf("아메리카노 %d잔 : %d원\n", su[j], price);
            } else if (menu[j] == 2) {
                price = l * su[j];
                System.out.printf("카페라떼 %d잔 : %d원\n", su[j], price);
            } else {
                price = b * su[j];
                System.out.printf("바닐라라떼 %d잔 : %d원\n", su[j], price);
            } 
            total += price;
        }

        System.out.println("=====================");
        System.out.printf("총액 : %d원\n", total);
		
		
	}

}
