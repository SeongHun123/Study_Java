package ch04;

public class MyNumberTest {

	public static void main(String[] args) {
									// x�� y���� ū��
		MyNumber myNumber = (x,y)-> x > y? x: y;
		
		System.out.println(myNumber.getMax(20,30));
			
		
	}

}
