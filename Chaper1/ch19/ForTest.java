package ch19;

public class ForTest {

	public static void main(String[] args) {
		// for 문
		int count = 1;
		int sum = 0;
		for (int i=0; i< 10; i++, count++) {
			
			sum += count;
			
		}
		
		System.out.println(sum);
		// while문
		int num = 1;
		int total = 0;
		
		while(num <= 10) {
			total += num;
			num ++;
		}
		System.out.println(total);
	}

}
/*
for 문 수행 순서
for (초기화식 ; 조건식; 증감식)
{
	수행문;
	.......
}

for문의 문장들은 생략 가능
- 초기화식 생략 : 이미 이전에 값이 초기화 되어 for 내부에서 값을 지정할 필요가 없는 경우
int  i=0;
for(;i<5;i++){

}
- 조건식 생략 : 반복 수행에 대한 조건이 수행문 내부에 있는 경우
for(i = 0;;i++){
	sum +=i;
	if(sum >200) break;
	
}
- 증감식 생략: 증감식에 대한 연산이 복잡하거나 다른 변수의 연산 결과값에 결정되는 경우
for(i = 0; i<5;){
	i = (++i) %10;
}
- 무한 반복
for (; ;){

}
*/