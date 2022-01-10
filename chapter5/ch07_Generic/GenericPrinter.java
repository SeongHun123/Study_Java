package ch07_Generic;

public class GenericPrinter<T> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
}
/*
 - 자료형 매개변수 T(type parameter):이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정,static 변수는 사용 x
 - GenericPrinter: 제네릭 자료형
 - E : element, K:key, V:value등 여러 알파벳을 의미에 따라 사용 가능
 */