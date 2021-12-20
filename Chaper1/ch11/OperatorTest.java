package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
	int myNum = 20;
	int yourNum = 20;
	
	myNum+= yourNum;
	System.out.println(myNum);
	
	
	
	int gameScore = 150;
	
	int lastScore = gameScore++;
	System.out.println(lastScore);
	System.out.println(gameScore);
		}

}
/*
자바의 연산자들
항과 연산자
- 항(operand) = 연산에 사용되는 값
- 연산자(operator) = 항을 이용하여 연산하는 기호

대입 연산자 ex) a='A' 
- 변수에 다른 변수나 값을 대입하는 연산자
- 이항 연산자 중 우선 순위가 가장 낮은 연산자들
- 왼쪽 변수=오른쪽 변수(또는 식,값)

부호 연산자 ex) num=10  -> println(-num) -> -10이 출력
- 단항 연산자
- 변수의 부호를 유지 하거나(+)바꿈(-)
- 실제 변수의 부호가 변하려면 대입 연산자를 사용해야함

복합 연산자
- <<= 비트를 왼쪽으로 이동하고 그 값을 왼쪽 항에 대입
- >>= 비트를 오른쪽으로 이동하고 그 값을 왼쪽 항에 대입합니다.
- >>>= 비트를 오른쪽으로 이동하고 그 값을 왼쪽하에 대입합니다(왼쪽에 채워지는 비트 값은 0)
- &= 두 항의 &비트 연산 후 그 값을 왼쪽 항에 대입합니다
- \= 두 항의 \비트 연산 후 그 값을 왼쪽 항에 대입
= ^= 두 항의 ^비트 연산후 그 값을 왼쪽 항에 대입

증가, 감소 연산자
- 단항 연산자
- 변수의 값을 1더하거나 1 뺄때 사용
- 연산자가 항의 앞에 있는가 뒤에 있는가에 따라 연산 시점과 결과가 달라짐
- 문장(statement)의 끝(;)을 기준으로 연산 시점을 생각해야함 
! ++= 항의 값에 1을 더함 val = ++num //먼저 num 값이 1증가한 후 val 변수에 대입
						    num++; //val 변수에 기존 num값을 대입한 후 num값 1 증가
						    						    
! --==항의 값에서 1을 뺌 원리는 위와 같음
*/