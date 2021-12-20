package ch10;

import java.awt.SystemColor;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		/*
		 byte bNum = 125; // 1바이트 == 8비트 
		
		int iNum = bNum;
		
		System.out.println(iNum);
		
		int jNum = 255;
		byte aNum = (byte) jNum; // 강제캐스팅을 해서 범위에 오바된 값을 넣게되면 자료값이 이상한것이 출력이 댐
		
		System.out.println(aNum);

		double dNum = 3.14;
		int hNum = (int)dNum;
		System.out.println(hNum);
	*/
		double dNum = 1.2;
		float fNum = 0.9F;  //flaot 지정해서 저장할텐 저장할 것 뒤에 f를 붙여야함
		
		int iNum1 = (int)dNum + (int)fNum; // 1 + 0
		int iNim2 = (int)(dNum+fNum); // 1.2+0.9 = 2.1 -> 2
		
		System.out.println(iNum1);
		System.out.println(iNim2);
	// 형변환을 먼저 하냐 마냐에 따라 출력값이 달라짐
	}

}
/*
literal(리터럴)
프로그램에서 사용하는 숫자,문자,논리값을 뜻함
리터럴은 상수 풀(constant pool)에 있음
정수 리터럴은 int로 , 실수 리터럴은 double 로 저장됨
정수의 범위가 넘어가는 경우는 L ,l  float로 사용하려는 경우는 F,f 식별자로 써줘야 함

형 변환(type conversion)
서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
묵시적 형 변환(explicit type conversion, 자동 형 변환)과 명시적 형 변환(implicit type conversion)이 있음
바이트 크기가 작은 자료형에서 큰 자료형으로 변환은 자동으로 이루어짐
덜 정밀한 자료형에서 더 정밀한 자료형 변환은 자동으로 이루어짐 정수->실수
*/