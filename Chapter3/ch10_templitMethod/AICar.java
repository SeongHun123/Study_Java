package ch10_templitMethod;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� �տ� ����ϴ�.");
		
	}

	@Override
	public void wiper() {
		System.out.println("");
	}

	@Override
	public void washCar() {
		System.out.println("�ڵ� ������ �մϴ�.");
	}
	
	
	
}