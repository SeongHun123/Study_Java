package ch09_error;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
/*
 try-catch-finally
 - finally 블럭에서 파일을 닫거나 네트워크를 닫는 등의 리소스 해제 구현을 함
 - try{}블럭이 수행되는 경우 finally{}블럭은 항상 수행 됨
 - 여러 개의 예외 블럭이 있는 경우 각각에 리소스를 해제하지 않고 finally 블록에서 해제하도록 구현
 - 컴파일러에 의해 예외가 처리 되는 예
 */