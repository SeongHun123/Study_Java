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
 ���׸� �޼����?
 - �ڷ��� �Ű������� �޼����� �Ű������� ��ȯ ������ ������ �޼���
 - �ڷ��� �Ű� ������ �ϳ� �̻��� ��쵵 ����
 - ���׸� Ŭ������ �ƴϾ ���ο� ���׸� �޼���� �����Ͽ� ��� �� �� ����

 */