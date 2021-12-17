package ch12;

public class LogicalTest {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1  + 10)<10) && ((i= i+2)<10);
		// 앞의 항이 false 이기때문에 뒤에 항을 계산하지 않았음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
/*
논리 연산자
관계 연산자와 혼합하여 많이 사용 됨
연산의 결과가 true(참),false(거짓)으로 반환 됨
- &&(논리 곱) 두 항이 모두 참인 경우에만 결과 값이 참 그렇지 않은 경우 모두 거짓
ex) booleanval = (5>3)&&(5>2);
- ||두 항중 하나의 항만 참이면 결과 값은 참 두 항이 모두 거짓이면 값은 거짓
- !(부정) 단항 연산자. 참인 경우는 거짓으로 바꾸고, 거짓은 경우는 참으로 바꿈

단락 회로 평가(short circuit evaluation)
항의 계산이 전부다 이뤄지지 않고 앞의 결과값만 가지고 계산이 이러질 경우
! 논리 곱(&&)은 두 항의 결과가 모두 true 일 때만 결과가 true
- 앞의 항의 결과가 false이면 뒤 항의 결과를 평가하지 않음
! 논리 합(||)은 두 항의 결과가 모두 false일 때만 결과가 false
- 앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음
*/
