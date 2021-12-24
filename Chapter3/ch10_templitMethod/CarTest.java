package ch10_templitMethod;

public class CarTest {

	public static void main(String[] args) {
		Car aicar = new AICar();
		aicar.run();
		
		Car mcar = new ManualCar();
		mcar.run();
	}

}
