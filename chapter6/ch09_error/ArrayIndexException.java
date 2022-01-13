package ch09_error;

public class ArrayIndexException {
	
	public static void main (String[] args) {
		int[] arr = {1,2,3,4,5};
		
		try {
		for(int i=0; i<=5;i++) { 
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		
		}
		System.out.println("here");
		
	}
	
}
/*
 try_catch문
 try 블록에는 예외가 발생할 가능성이 있는 코드를 작성하고 try블록 안에서 예외가 발생하면 catch 블록ㄱ이 수행
 try{
 	예외가 발생할 수 있는 코드 부분
 }catch(처리할 예외 타입e){
 try블록 안에서 예외가 발생했을 때 예외 처리하는 부분
 }
 */