package ch13;

public class BitOperationTest {

	public static void main(String[] args) {

	int num1 = 5;
	int num2 = 10;
	
	System.out.println(num1 | num2);
	System.out.println(num1 & num2);
	System.out.println(num1 ^ num2);
	System.out.println(~num1);
	
	System.out.println(num1 << 2);
	System.out.println(num1);
	System.out.println(num1 <<= 2);
	System.out.println(num1);
	}

}
/*
��Ʈ ������
���Կ����ڿ� �ٸ� �����ڰ� �Բ� ����
����ũ: Ư�� ��Ʈ�� ������ �� ���� ��Ʈ ���� ����� ��
��Ʈ�ѱ�: Ư�� ��Ʈ�鸸�� 1�� ������ ����ϰ� ���� ��
ex) & 00001111(����4��Ʈ�� 1�� ��Ʈ�� ������)
��Ʈ���� : Ư�� ��Ʈ�鸸�� 0���� �����ؼ� ����ϰ� ���� �� 
ex) | 11110000(����4��Ʈ �� 0�� ��Ʈ�� 0���� �����)
��Ʈ ���: ��� ��Ʈ���� 0�� 1��, 1�� 0���� �ٲٰ� ���� ��
- ~ = ��Ʈ�� ����(1�� ����)  a=~a;    0->1  , 1->0
- & ��Ʈ ���� AND 1&1 1��ȯ �׿ܴ� 0
- | ��Ʈ ���� OR 0|0 0��ȯ �� �ܴ� 1
- ^ ��Ʈ ���� XOR �ΰ��� ��Ʈ�� ���� �ٸ� ��쿡 1�� ��ȯ
- << ���� shift a<<2 ���� a�� 2��Ʈ ��ŭ �������� �̵�
- >> ������ shift a>>2 ���� a�� 2��Ʈ��ŭ ���������� �̵�
>>> ������ shift >>������ ���� ä������ ��Ʈ�� ��ȣ�� ��� ���� 0

*/