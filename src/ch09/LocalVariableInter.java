package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
	var i = 10;
	var j = 10.0;
	var str = "test";
	
	System.out.println(i);
	System.out.println(j);
	System.out.println(str);
	
	var str2 = str;
	System.out.println(str2);
	}

}
/*
 논리형 
 Ture(참),False(거짓) 두가지만 나타냄
 1바이트를 사용함 ==8비트 
 값이 존재하는지, 배열이 비었는지,결과가 참인지 거짓인지등을 표현
 
 지역 변수 자료형 없이 사용하기(자바 10 부터 지원)
 지역 변수란? {}이렇게 중괄호 안에 쓰는걸 블록이라고 하는데 블록안에 쓰는 변수를 지역 변수라고 함
 추론 가능한 변수에 대한 자료형을 선언하지 않음 ==var
 한번 선언하여 추론 된 변수는 다른 타입의 값을 대입 할 수 없음
 지역 변수만 사용 가능
 java 는 처음 데이터형만 저장이 가능해서 처음 저장한 데이터형만 가능
 str = "hello" -> str=3 저장 불가능
*/