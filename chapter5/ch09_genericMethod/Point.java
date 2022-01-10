package ch09_genericMethod;

public class Point<T,V> {
	T x;
	V y;
	
	Point(T x,V y){
		this.x = x;
		this.y = y;
	}
	
	public T getX(){
		return x;
	}
	
	public V getY(){
		return y;
	}

}
/*
 제네릭 메서드란?
 - 자료형 매개변수를 메서드의 매개변수나 반환 값으로 가지는 메서드
 - 자료형 매개 변수가 하나 이상인 경우도 있음
 - 제네릭 클래스가 아니어도 내부에 제네릭 메서드는 구현하여 사용 할 수 있음

 */