package ch08;

public class CharterTest {

	public static void main(String[] args) {
	char ch1 = 'A';
	System.out.println(ch1);
	System.out.println((int)ch1);
	
	
	char ch2 = 66;
	System.out.println(ch2);
	System.out.println((char)ch2);
	
	
	int ch3 = 67;
	System.out.println(ch3);
	System.out.println((char)ch3);
	
	char han = '한';
	char ch = '\uD55C';  //유니코드 쓰는 방법(유니코드는 코드표가 따로 있음)  16진수 로 표현
	
	System.out.println(han);
	System.out.println(ch);
	}

}
/*
  자료형 data type 
  ASKill  1바이트 ==8비트 저장 공간
  Unicode 모든 나라의 문자들을 하나의 코드표로 통합한 거
  UTF-8 == 1바이트에서 4바이트 까지 다양하게 문자를 표현할 수 있음
  UTF-16 == 2바이트로 문자를 표현  
  encoding  == 문자가 숫자로 벼환되는 것
  decoding == 숫자에서 다시 문자로 변환되는 것
  ASKII code == 알파벳과 숫자 특수 문자등을 1바이트에서 표현하는데 사용하는 문자세트
  
  java 에서 문자 표현 할때 
  char ch = 'A';('A'!="A") 자바에서는 두개가 다름 'A' ==2byte 저장공간 "A" == 문자열
  내부적으로 숫자로 표현되므로 숫자를 넣어도 문자 출력 가능(단 양수만 가능)
 */