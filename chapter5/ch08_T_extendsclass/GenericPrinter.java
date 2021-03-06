package ch08_T_extendsclass;

public class GenericPrinter<T extends Material> {
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
 <T extends 클래스> 사용하기
 - 상위 클래스의 필요성
 - T 자료형의 범위를 제한 할 수 있음
 - 상위 클래스에서 선언하거나 정의하는 메서드를 활용할 수 있음
 - 상속을 받지 않는 경우T는 Object로 변환되어 Object클래스가 기본으로 제공하는 메서드만 사용 가능
 */
 