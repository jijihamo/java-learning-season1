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
		//gugudan3(6, num2);
		
		/* 8, 9단 */
		//gugudan4(num1, num2);
		
		/* 배열로 지정 구구단 구현 */
		//gugudan5();
		
		/* 배열로 전체 구구단 구현 */
		gugudan6();
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
	
	public static void gugudan4(int num1, int num2) {
		
		System.out.println("구구단 중 출력할 단은 ? : ");
		
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		
		if (!(num1 >= 2 && num1 <= 9)) {
			System.out.println("2 이상, 9 이하의 값만 입력할 수 있습니다.");
			return;
		}
		
		System.out.println("[구구단 " + num1 + "단]");
		for (int i = num2; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
	}
	
	public static void gugudan5() {
		
		int[] result = new int[9];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		System.out.println("[구구단 " + num + "단]");
		for (int i = 1; i <= result.length; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		
	}
	
	public static void gugudan6() {
		
		int[] result = new int[9];
		int num1 = 2;
		
		for (int i = num1; i < 10; i++) {
			System.out.println("[구구단 " + i + "단]");
			for (int j = 1; j < result.length; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("");
		}
		
	}
}
