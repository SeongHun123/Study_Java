package ch05_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
	
	public static void main(String[] args) {
	
		int[]arr = {1,2,3,4,5};
		
		for(int num:arr) {
			System.out.println(num);
		}
		
		System.out.println();
		//Arrays.stream(arr) ��������� int stream�� ��ȯ
		//forEach -> �ϳ��� ������� ��ɾ�
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}
}
/*
 ��Ʈ��(Stream)
 - �ڷ��� ���� ������� ������ ������ ����
 �迭, �÷����� ������� ���� ���� ��
 �ϰ��� �ִ� �������� �ڷ��� ó���� ���� �����ϰ� ��
 - �ѹ� �����ϰ� ����� ��Ʈ���� ���� �� �� ����
 �ڷῡ ���� ��Ʈ���� �����Ͽ� ������ �����ϸ� ��Ʈ���� �Ҹ��
 �ٸ� ������ �����ϱ� ���ؼ��� ��Ʈ���� �ٽ� ����
 - ��Ʈ�� ������ ���� �ڷḦ �������� ����
 �ڷῡ ���� ��Ʈ���� �����ϸ� ��Ʈ���� ����ϴ� �޸� ������ ������ �����ǹǷ� ������ ����ǵ� ���� �ڷῡ ���� ������ �߻�x
 - ��Ʈ�� ������ �߰� ����� ���� �������� ���� ��
 ��Ʈ���� ���� �߰� ������ ���� ���� ������ ����� �� ������ ���� ������ �������� �� ���� �����
 ���������� ȣ��Ǿ�� �߰� ���꿡 ���� ������ �̷�� ���� �� ����� ����� ��
 ���� �߰� ���꿡 ���� ����� ���� �߿� �˼� ����
 �̸�"���� ����"�̶� ��
 */