package ch20_array;

public class Array {
	
	public static void main(String[] args) {
	int[] arr = new int[10];
	int total = 0;
	
	// int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10}
	// arr.length == �迭���� Ȯ��
	for(int i=0,num=1; i<arr.length; i++) {
		arr[i] = num++;
		}
	// ���� for�� = ó������ ������ �������� ��
	for( int num:arr) {
		total += num;
		}
	System.out.println(total);
	}
	
}
/*
 �迭
 - ������ �ڷ����� ������ �ڷ� ����
 - �ε��� �����ڸ� �̿��Ͽ� ���� ������ ����
 - ������ ��ġ�� ���� ��ġ�� ����
 - �迭�� ������ 0���� ����
 - �ڹٿ��� ��ü �迭�� ������ ArrayList�� ���� Ȱ����
 
  �迭 ����
  int[] arr1 = new int[10];
  int arr2[] = new int[10];
  
  �迭 �ʱ�ȭ
  int[] numbers = new int[]{10,20,30}; ���� �����ؾ� ��
  int[] numbers = {10,20,30}  new int ���� ����
  int[] ids;
  ids = new int[]{10,20,30}; ������ �迭�� �����ϴ� ���� new int[] ���� �Ұ���
  
  
 */