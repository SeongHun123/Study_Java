package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010,"�̼���");

		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
	
		VIPCustomer customerkim = new VIPCustomer(10020,"������");
		customerkim.bonusPoint = 10000;
		System.out.println(customerkim.showCustomerInfo());
	
	}

}
