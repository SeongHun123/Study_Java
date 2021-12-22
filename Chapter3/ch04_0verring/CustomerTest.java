package ch04_0verring;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.salePrice(1000);
		System.out.println(customerLee.showCustomerInfo()+ price);
	
		VIPCustomer customerkim = new VIPCustomer(10020,"김유신");
		customerkim.bonusPoint = 10000;
		price= customerkim.salePrice(1000);
		System.out.println(customerkim.showCustomerInfo()+price);
		
		Customer vc = new VIPCustomer(12345,"noname");
		
		System.out.println(vc.salePrice(1000));
	}
}
/*
 하위 클래스에서 메서드 재정의 하기
 오버라이딩(overriding):상위 크래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는경우 하위 클래스에서 제정의 가능

 */