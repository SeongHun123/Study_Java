package ch13;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {
	
		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");
		Scanner scanner = new Scanner(System.in); // System.in -> 입력받는 메서드 
		System.out.println("입력 1:");
		int num1 = scanner.nextInt();
		System.out.println("입력 2:");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2)? num1:num2;
		System.out.println(max);
	}

}

/*
조건 연산자
심항 연산자
조건식의 결과가 true인 경우와 false인 경우에 따라 다른 결과가 수행
if문을 간단하 표현할때 사용
*/