package ch04_0verring;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010,"�̼���");
		customerLee.bonusPoint = 1000;
		int price = customerLee.salePrice(1000);
		System.out.println(customerLee.showCustomerInfo()+ price);
	
		VIPCustomer customerkim = new VIPCustomer(10020,"������");
		customerkim.bonusPoint = 10000;
		price= customerkim.salePrice(1000);
		System.out.println(customerkim.showCustomerInfo()+price);
		
		Customer vc = new VIPCustomer(12345,"noname");
		
		System.out.println(vc.salePrice(1000));
	}
}
/*
 ���� Ŭ�������� �޼��� ������ �ϱ�
 �������̵�(overriding):���� ũ������ ���ǵ� �޼����� ���� ������ ���� Ŭ�������� ������ ����� ���� �ʴ°�� ���� Ŭ�������� ������ ����

 */