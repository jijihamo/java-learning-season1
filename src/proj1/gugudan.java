package proj1;

public class gugudan {
	public static int[] calculate(int times) {
		
		int[] result = new int[9];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		
		return result;
	}
	
	public static void print(int[] result) {

		int num = result[0];
		System.out.println("[������ " + num + "��]");
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(num + " * " + (i+1) + " = " + result[i]);
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		int[] result = new int[9];
		
		for (int j = 2; j < 10; j++) {
			// calculate�� print �޼ҵ� Ȱ���� ������ �����
			result = calculate(j);
			print(result);
		}
	}
}
