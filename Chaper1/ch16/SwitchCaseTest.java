package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day;
		switch(month){
			case 1 : case 3: case 5: case 7: case 8: case 10: case 12: 
				day = 31;
				break;  // 이거 안쓰면 다른 case를 계속 확인하기때문에 break를 써야 빠져나감
			case 2 : 
				day = 28;
				break;

			case 4 : case 6: case 9: case 11:  
				day = 30;
				break;

			default:
				System.out.println("존재하지 않는 달입니다.");
				day = -1;
		}
		System.out.println(month + "월은"+day+"일 입니다.");
	}

}
/*
조건이 여러 개 일 때 간단히 표현되는 switch-case 문
switch-case
- if-else if -else 문을 사용할 때 복잡하고 번거로운 부분을 가독성 좋게 구현
- 비교 조건이 특정 값이나 문자열인 경우
- break 문을 사용하여 각 조건이 만족되면 switch 블럭을 빠져나오도록 함
- 자바 14부터 좀 더 간결해진 표현식이 지원 됨 (break 사용 x)
- 문자열도 사용 가능
 */

