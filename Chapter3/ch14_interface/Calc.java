package ch14_interface;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("������ ��Ģ������ �����մϴ�.");
	}
	
	static int total(int[] arr) {
		
		int total = 0;
		for (int num : arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("My Method");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
}