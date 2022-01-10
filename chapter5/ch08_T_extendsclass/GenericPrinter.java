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
 <T extends Ŭ����> ����ϱ�
 - ���� Ŭ������ �ʿ伺
 - T �ڷ����� ������ ���� �� �� ����
 - ���� Ŭ�������� �����ϰų� �����ϴ� �޼��带 Ȱ���� �� ����
 - ����� ���� �ʴ� ���T�� Object�� ��ȯ�Ǿ� ObjectŬ������ �⺻���� �����ϴ� �޼��常 ��� ����
 */
 