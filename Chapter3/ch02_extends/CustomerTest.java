package ch02_extends;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerId(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
	
		VIPCustomer customerkim = new VIPCustomer();
		customerkim.setCustomerName("������");
		customerkim.setCustomerId(10020);
		customerkim.bonusPoint = 10000;
		System.out.println(customerkim.showCustomerInfo());
	
	}

}
