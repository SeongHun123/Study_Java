package ch10_templitMethod;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void starCar() {
		System.out.println("�õ��� �մϴ�");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {}
	
	// �� �޼���� �ó����� �̱⶧���� ��ȭx 1
	final public void run() {
		starCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
