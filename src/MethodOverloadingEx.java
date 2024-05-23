
class Adder {
	static int add(int a, int b) {
		return a + b;

	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class MethodOverloadingEx {
	public static void main(String[] args) {
		int add = Adder.add(20, 30);
		System.out.println("Addition of 2 numbers :" + add);

		int add3 = Adder.add(10, 50, 40);
		System.out.println("Addition of 3 numbers :" + add3);
	}

}
