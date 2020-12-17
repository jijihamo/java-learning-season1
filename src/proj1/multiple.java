package proj1;

import java.util.Scanner;

public class multiple {
	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 1;
		
		/* 변수 지정 */
		//gugudan1(num1, num2);
				
		/* 변수 입력 받기 */
		//gugudan2(num1, num2);
		
		/* 6, 7단 */
		gugudan3(6, num2);
		
	}
	
	public static void gugudan1(int num1, int num2) {

		System.out.println("[구구단 2단]");
		for (int i = num2; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
		
		num1 += 1;
		
		System.out.println("");
		System.out.println("[구구단 3단]");
		for (int i = num2; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
		
		num1 += 1;

		System.out.println("");
		System.out.println("[구구단 4단]");
		for (int i = num2; i < 10; i++) {
			int result = num1 * i;
			System.out.println(num1 + " * " + i + " = " + result);
		}
		
		num1 += 1;

		System.out.println("");
		System.out.println("[구구단 5단]");
		for (int i = num2; i < 10; i++) {
			int result = num1 * i;
			System.out.println(num1 + " * " + i + " = " + result);
		}
	}
	
	public static void gugudan2(int num1, int num2) {
		
		System.out.println("구구단 중 출력할 단은 ? : ");
		
		Scanner scan  = new Scanner(System.in);
		num1 = scan.nextInt();
		
		System.out.println("");
		System.out.println("[구구단 " + num1 + "단]");
		for (int i = num2; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
	}
	
	public static void gugudan3(int num1, int num2) {
		
		int cnt = num2;
		
		System.out.println("[구구단 " + num1 + "단]");
		while (cnt < 10) {
			System.out.println(num1 + " * " + cnt + " = " + num1 * cnt);
			cnt++;
		}
		
		num1++;
		cnt = num2;
		
		System.out.println("");
		System.out.println("[구구단 " + num1 + "단]");
		while (cnt < 10) {
			System.out.println(num1 + " * " + cnt + " = " + num1 * cnt);
			cnt++;
		}
	}
}
