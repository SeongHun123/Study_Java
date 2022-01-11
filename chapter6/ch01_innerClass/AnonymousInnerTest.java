package ch01_innerClass;

class Outter2{
	
	Runnable getRunnable(int i){

		int num = 100;
		
		return new Runnable() {
				
		@Override
		public void run() {
			//num = 200;   //에러 남
			//i = 10;      //에러 남
			System.out.println(i);
			System.out.println(num);
			}
		};
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
			
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
	
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		
		out.runner.run();
	}
}
/*
지역 내부 클래스
- 지역 변수와 같이 메서드 내부에서 정의하며 사용하는 클래스
- 메서드의 호출이 끝나면 메서드에 사용된 지역변수의 유효성은 사라짐
- 메서드 호출 이후에도 사용해야 하는 경우가 있을 수 있으므로 지역 내부 클래스에서 사용하는 메서드의 지역 변수나 매개 변수는
final로 선언
 */