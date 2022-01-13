package ch11;

public class PasswordException extends Exception{
	
	public PasswordException(String message) {
		super(message);
	}
	
}
/*
 사용자 정의 예외 클래스 구현하기
 - 기존 예외 클래스중 가장 유사한 예외 클래스에서 상속 받아 사용자 정의 예외 클래스를 만든다
 - 기본적으로 Exception 클래스를 상속해서 만들 수 있음
 */