package proj1;

import java.util.Scanner;

public class multiple {
	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 1;
		
		/* ���� ���� */
		//gugudan1(num1, num2);
				
		/* ���� �Է� �ޱ� */
		//gugudan2(num1, num2);
		
		/* 6, 7�� */
		//gugudan3(6, num2);
		
		/* 8, 9�� */
		//gugudan4(num1, num2);
		
		/* �迭�� ���� ������ ���� */
		//gugudan5();
		
		/* �迭�� ��ü ������ ���� */
		gugudan6();
	}
	
	public static void gugudan1(int num1, int num2) {

		System.out.println("[������ 2��]");
		for (int i = num2; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
		
		num1 += 1;
		
		System.out.println("");
		System.out.println("[������ 3��]");
		for (int i = num2; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
		
		num1 += 1;

		System.out.println("");
		System.out.println("[������ 4��]");
		for (int i = num2; i < 10; i++) {
			int result = num1 * i;
			System.out.println(num1 + " * " + i + " = " + result);
		}
		
		num1 += 1;

		System.out.println("");
		System.out.println("[������ 5��]");
		for (int i = num2; i < 10; i++) {
			int result = num1 * i;
			System.out.println(num1 + " * " + i + " = " + result);
		}
	}
	
	public static void gugudan2(int num1, int num2) {
		
		System.out.println("������ �� ����� ���� ? : ");
		
		Scanner scan  = new Scanner(System.in);
		num1 = scan.nextInt();
		
		System.out.println("");
		System.out.println("[������ " + num1 + "��]");
		for (int i = num2; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
	}
	
	public static void gugudan3(int num1, int num2) {
		
		int cnt = num2;
		
		System.out.println("[������ " + num1 + "��]");
		while (cnt < 10) {
			System.out.println(num1 + " * " + cnt + " = " + num1 * cnt);
			cnt++;
		}
		
		num1++;
		cnt = num2;
		
		System.out.println("");
		System.out.println("[������ " + num1 + "��]");
		while (cnt < 10) {
			System.out.println(num1 + " * " + cnt + " = " + num1 * cnt);
			cnt++;
		}
	}
	
	public static void gugudan4(int num1, int num2) {
		
		System.out.println("������ �� ����� ���� ? : ");
		
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		
		if (!(num1 >= 2 && num1 <= 9)) {
			System.out.println("2 �̻�, 9 ������ ���� �Է��� �� �ֽ��ϴ�.");
			return;
		}
		
		System.out.println("[������ " + num1 + "��]");
		for (int i = num2; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
	}
	
	public static void gugudan5() {
		
		int[] result = new int[9];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = scan.nextInt();
		
		System.out.println("[������ " + num + "��]");
		for (int i = 1; i <= result.length; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		
	}
	
	public static void gugudan6() {
		
		int[] result = new int[9];
		int num1 = 2;
		
		for (int i = num1; i < 10; i++) {
			System.out.println("[������ " + i + "��]");
			for (int j = 1; j < result.length; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("");
		}
		
	}
}
