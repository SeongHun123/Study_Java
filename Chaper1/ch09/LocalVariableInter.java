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
 ���� 
 Ture(��),False(����) �ΰ����� ��Ÿ��
 1����Ʈ�� ����� ==8��Ʈ 
 ���� �����ϴ���, �迭�� �������,����� ������ ������������ ǥ��
 
 ���� ���� �ڷ��� ���� ����ϱ�(�ڹ� 10 ���� ����)
 ���� ������? {}�̷��� �߰�ȣ �ȿ� ���°� ����̶�� �ϴµ� ��Ͼȿ� ���� ������ ���� ������� ��
 �߷� ������ ������ ���� �ڷ����� �������� ���� ==var
 �ѹ� �����Ͽ� �߷� �� ������ �ٸ� Ÿ���� ���� ���� �� �� ����
 ���� ������ ��� ����
 java �� ó�� ���������� ������ �����ؼ� ó�� ������ ���������� ����
 str = "hello" -> str=3 ���� �Ұ���
*/