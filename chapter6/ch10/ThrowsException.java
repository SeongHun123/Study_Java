package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		
		ThrowsException test  = new ThrowsException();
		
		try {
			test.loadClass("a.txt","java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch ( Exception e) {
			
		} 
		
		System.out.println("end");
	}
}


/*
 예외 처리 미루기
 - 예외 처리는 예외가 발생한 문장에서 try-catch 블록으로 처리하는 방법과 이를 사용하는 부분에서 처리하는 방법 두 가직 있음
 - throws를 이용하면 예외가 발생할 수 있는 부분을 사용하는 문장에서 예외를 처리할 수 있음
 
 */