package ch01_innerClass;


class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	
	class InClass{
		
		int iNum = 100;
		
		
		void inTest() {
			System.out.println("OutClass num = "+num+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass num = "+sNum+"(�ܺ� Ŭ������ static ����)");
			System.out.println("InClass num = "+iNum+"(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InClass num = "+iNum+"(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass num = "+sNum+"(�ܺ� Ŭ������ static ����)");
			System.out.println("InClass sInNum = "+sInNum+"(���� Ŭ������ static ����)");
		}
		
		static void sTest() {
			System.out.println("OutClass num = "+sNum+"(�ܺ� Ŭ������ static ����)");
			System.out.println("InClass sInNum = "+sInNum+"(���� Ŭ������ static ����)");
			
		}
	}
}


public class innerTest {

	public static void main(String[] args) {
		
//		OutClass outClass = new OutClass();
//		outClass.usingClass();
//		
//		System.out.println("");
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest(); 
	}

}
/*
 �ν��Ͻ� ���� Ŭ����
 - ���������� ����� Ŭ������ ����(private���� ���� �ϴ°��� ����)
 - �ܺ� Ŭ������ ���� �� �� ������(���� ���� Ŭ������ �ٸ�)
 - private�� �ƴ� ���� Ŭ������ �ٸ� �ܺ� Ŭ�������� ������ �� ����
 */