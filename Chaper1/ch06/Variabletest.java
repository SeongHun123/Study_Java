package ch06;

public class Variabletest {

	public static void main(String[] args) {

		
		byte bnum = -128;
		System.out.println(bnum);
		
		//int num = 12345678900;
		long Lnum = 12345678900L; // 위처럼 숫자가 너무커서 안들어가면 숫자뒤에 L을 붙여서 8바이트로 바꿔야함
		System.out.println(Lnum);
	}

}
