package ch11_interFace;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}
/*
인터페이스(interface)
- 모든 메서드가 추상 메서드로 선언 public abstract
- 모든 변수는 상수로 선언됨 public static final

인터페이스를 쓰는 이유?
인터페이스가 하는 일
- 클래스나 프로그램이 제공하는 기능을 명시적으로 선언
- 일종의 클라이언트 코드와의 약속이며 클래스나 프로그램이 제ㅐ공하는 명세
- 클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고 이를 구현한 클래스를 사용할 수 있음
- 어떤 객체가 하나의 인터페이스 타입이라는 것은 그 인터페이스가 제공하는 모든 메서드를 구현했다는 의미
- 인터페이스를 구현한 다양한 개체를 사용함 - 다향성

*/