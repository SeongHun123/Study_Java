package ch03_stringClass;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3==str4);
	}

}
/*
 String Class
 -힙 메모리는 생성될때마다 다른 주소값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가짐
- 한번 생성된 String은 불변임
- String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됨(메모리 낭비)
*/