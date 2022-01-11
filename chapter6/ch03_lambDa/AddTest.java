package ch03_lambDa;

public class AddTest {

	public static void main(String[] args) {
		//람다식 구현
		Add addL = (x,y) -> {return x+y;};
		
		System.out.println(addL.add(2, 3));
		
	}

}
