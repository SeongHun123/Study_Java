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
			System.out.println("OutClass num = "+num+"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass num = "+sNum+"(외부 클래스의 static 변수)");
			System.out.println("InClass num = "+iNum+"(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InClass num = "+iNum+"(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass num = "+sNum+"(외부 클래스의 static 변수)");
			System.out.println("InClass sInNum = "+sInNum+"(내부 클래스의 static 변수)");
		}
		
		static void sTest() {
			System.out.println("OutClass num = "+sNum+"(외부 클래스의 static 변수)");
			System.out.println("InClass sInNum = "+sInNum+"(내부 클래스의 static 변수)");
			
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
 인스턴스 내부 클래스
 - 내부적으로 사용할 클래스를 선언(private으로 선언 하는것을 권장)
 - 외부 클래스가 생성 된 후 생성됨(정적 내부 클래스와 다름)
 - private이 아닌 내부 클래스는 다른 외부 클래스에서 생성할 수 있음
 */