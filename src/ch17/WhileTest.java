package ch17;

public class WhileTest {

	public static void main(String[] args) {
	
		int num = 1;
		int sum = 0;
		while (num <=10) {
			sum +=num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
/*
 반복문 -while
 조건이 참인 동안 반복 수행하기
 - 조건이 맞지 않으면 반복하던 수행을 멈춤
 - 조건은 주로 반복 횟수나 값의 비교의 결과에 따라 true, false 판단
*/
