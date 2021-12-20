package ch10;

import java.awt.SystemColor;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		/*
		 byte bNum = 125; // 1����Ʈ == 8��Ʈ 
		
		int iNum = bNum;
		
		System.out.println(iNum);
		
		int jNum = 255;
		byte aNum = (byte) jNum; // ����ĳ������ �ؼ� ������ ���ٵ� ���� �ְԵǸ� �ڷᰪ�� �̻��Ѱ��� ����� ��
		
		System.out.println(aNum);

		double dNum = 3.14;
		int hNum = (int)dNum;
		System.out.println(hNum);
	*/
		double dNum = 1.2;
		float fNum = 0.9F;  //flaot �����ؼ� �������� ������ �� �ڿ� f�� �ٿ�����
		
		int iNum1 = (int)dNum + (int)fNum; // 1 + 0
		int iNim2 = (int)(dNum+fNum); // 1.2+0.9 = 2.1 -> 2
		
		System.out.println(iNum1);
		System.out.println(iNim2);
	// ����ȯ�� ���� �ϳ� ���Ŀ� ���� ��°��� �޶���
	}

}
/*
literal(���ͷ�)
���α׷����� ����ϴ� ����,����,������ ����
���ͷ��� ��� Ǯ(constant pool)�� ����
���� ���ͷ��� int�� , �Ǽ� ���ͷ��� double �� �����
������ ������ �Ѿ�� ���� L ,l  float�� ����Ϸ��� ���� F,f �ĺ��ڷ� ����� ��

�� ��ȯ(type conversion)
���� �ٸ� �ڷ��� ���� ������� ������ ���� �ϳ��� �ڷ������� �����ϴ� ��
������ �� ��ȯ(explicit type conversion, �ڵ� �� ��ȯ)�� ����� �� ��ȯ(implicit type conversion)�� ����
����Ʈ ũ�Ⱑ ���� �ڷ������� ū �ڷ������� ��ȯ�� �ڵ����� �̷����
�� ������ �ڷ������� �� ������ �ڷ��� ��ȯ�� �ڵ����� �̷���� ����->�Ǽ�
*/