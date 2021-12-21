package ch20_array;

public class Array {
	
	public static void main(String[] args) {
	int[] arr = new int[10];
	int total = 0;
	
	// int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10}
	// arr.length == 배열길이 확인
	for(int i=0,num=1; i<arr.length; i++) {
		arr[i] = num++;
		}
	// 향상된 for문 = 처음부터 끝까지 돌때쓰는 것
	for( int num:arr) {
		total += num;
		}
	System.out.println(total);
	}
	
}
/*
 배열
 - 동일한 자료형의 순차적 자료 구조
 - 인덱스 연산자를 이용하여 빠른 참조가 가능
 - 물리적 위치와 논리적 위치가 동일
 - 배열의 순서는 0부터 시작
 - 자바에서 객체 배열을 구현한 ArrayList를 많이 활용함
 
  배열 선언
  int[] arr1 = new int[10];
  int arr2[] = new int[10];
  
  배열 초기화
  int[] numbers = new int[]{10,20,30}; 개수 생략해야 함
  int[] numbers = {10,20,30}  new int 생략 가능
  int[] ids;
  ids = new int[]{10,20,30}; 선언후 배열을 생성하는 경우는 new int[] 생략 불가능
  
  
 */