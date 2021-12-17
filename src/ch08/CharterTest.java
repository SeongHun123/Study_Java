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
	
	char han = '��';
	char ch = '\uD55C';  //�����ڵ� ���� ���(�����ڵ�� �ڵ�ǥ�� ���� ����)  16���� �� ǥ��
	
	System.out.println(han);
	System.out.println(ch);
	}

}
/*
  �ڷ��� data type 
  ASKill  1����Ʈ ==8��Ʈ ���� ����
  Unicode ��� ������ ���ڵ��� �ϳ��� �ڵ�ǥ�� ������ ��
  UTF-8 == 1����Ʈ���� 4����Ʈ ���� �پ��ϰ� ���ڸ� ǥ���� �� ����
  UTF-16 == 2����Ʈ�� ���ڸ� ǥ��  
  encoding  == ���ڰ� ���ڷ� ��ȯ�Ǵ� ��
  decoding == ���ڿ��� �ٽ� ���ڷ� ��ȯ�Ǵ� ��
  ASKII code == ���ĺ��� ���� Ư�� ���ڵ��� 1����Ʈ���� ǥ���ϴµ� ����ϴ� ���ڼ�Ʈ
  
  java ���� ���� ǥ�� �Ҷ� 
  char ch = 'A';('A'!="A") �ڹٿ����� �ΰ��� �ٸ� 'A' ==2byte ������� "A" == ���ڿ�
  ���������� ���ڷ� ǥ���ǹǷ� ���ڸ� �־ ���� ��� ����(�� ����� ����)
 */