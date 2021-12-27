package ch03_stringClass;

public class StringBuliderTest {

	public static void main(String[] args) {
		String java  = new String("java");
		String android = new String("android");
		
		
		StringBuilder buffer  = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		String test = buffer.toString();
		System.out.println(test);
		
				
	}

}
/*
 StringBulider 
 - ���������� �������� char[]�� ��������� ����
 - ���ڿ��� ������ �����ϰų� ������ �� ����ϸ� ������
 - ���ο� �ν��Ͻ��� �������� �ʰ� char[]�� ������
 - StringBuffer�� ��Ƽ ������ ���α׷��ֿ��� ����ȭ�� ����
 - �ܾ� ������ ���α׷������� StringBuffer ����� ����
 - toString()�޼���� String��ȯ
 */