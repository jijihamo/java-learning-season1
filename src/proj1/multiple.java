package proj1;

public class multiple {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 1;
		
		System.out.println("[������ 2��]");
		for (int i = num2; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
		
		num1 += 1;
		
		System.out.println("[������ 3��]");
		for (int i = num2; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
		
	}
}
