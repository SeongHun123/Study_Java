package ch14;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {

		
	Scanner scanner = new Scanner(System.in);
	int age = scanner.nextInt();
	
	if (age>=8) {
		System.out.println("학교에 다닙니다.");
	}
	
	
	else {
	System.out.println("노는게 제일 좋아");
	}
	
	
	}
}
/*
조건문
주어진 조건에 따라 다른 실행이 이루어 지도록 구현
*/