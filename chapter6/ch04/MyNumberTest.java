package ch04;

public class MyNumberTest {

	public static void main(String[] args) {
									// x가 y보다 큰지
		MyNumber myNumber = (x,y)-> x > y? x: y;
		
		System.out.println(myNumber.getMax(20,30));
			
		
	}

}
