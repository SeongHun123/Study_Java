package ch20_array;

public class ArrayTest {

	public static void main(String[] args) {
		double[] dArr = new double[5];
		
		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		
		double mtotal = 1;
		for(int i=0; i<count ;i++) {
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);
	}

}
/*
 배열의 길이와 요소의 개수는 동일하지 않음
 - 배열을 선언하면 개수만큼 메모리가 할당되지만, 실제 요소(데이터)가 없는 경우도 있음
 - 배열을 length 속성은 배열을 개수를 반환해주기 때문에 요소의 개수와는 다름

 */