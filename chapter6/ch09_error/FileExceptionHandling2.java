package ch09_error;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling2 {

	public static void main(String[] args) {
	
		try (FileInputStream fis = new FileInputStream("a.txt")){
			
			System.out.println("read");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
/*
try-with-resources 문
- 리소스를 사용하는 경우 close() 하지 않아도 자동으로 해제 되도록 함
- 자바 7부터 사용 가능
- 리소스를 try 내부에서 선언
- close()를 명시적으로 호출하지 않아도 try{}블록에서 열린 리소스는 정상적인 경우나 예외가 발생한 경우 모두 자동 해제
- 해당 리소스 클래스가 AutoCloseable을 구현하고 있음
- 자바 9 부터 리소스는 try()외부에서 선언하고 변수만을 try(obj)와 같이 사용할 수 있음
 */