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
 - �ڷ��� �Ű����� T(type parameter):�� Ŭ������ ����ϴ� ������ ���� ����� �ڷ����� ����,static ������ ��� x
 - GenericPrinter: ���׸� �ڷ���
 - E : element, K:key, V:value�� ���� ���ĺ��� �ǹ̿� ���� ��� ����
 */