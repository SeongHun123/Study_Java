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
 -�� �޸𸮴� �����ɶ����� �ٸ� �ּҰ��� ��������, ��� Ǯ�� ���ڿ��� ��� ���� �ּ� ���� ����
- �ѹ� ������ String�� �Һ���
- String�� �����ϸ� ������ String�� ����Ǵ� ���� �ƴ� ���ο� ���ڿ��� ������(�޸� ����)
*/