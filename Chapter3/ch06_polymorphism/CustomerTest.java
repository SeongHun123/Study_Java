package ch06_polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010,"ToMas");
		Customer customerJ = new Customer(10020,"James");
		Customer customerE = new GoldCustomer(10030,"Edward");
		Customer customerP = new GoldCustomer(10040,"percy");
		Customer customerK = new VIPCustomer(10050,"kim");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
//		for(Customer customer: customerList) {
//			System.out.println(customer.showCustomerInfo());
//		}
//		
//		int price = 10000;
//		for(Customer customer : customerList) {
//			int cost = customer.salePrice(price);
//			System.out.println(customer.getCustomerName()+"남이"+cost+"원 지불하셧습니다.");
//			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는"+customer.bonusPoint+"입니다.");
//		}
		if( customerE instanceof GoldCustomer) {
			GoldCustomer vc = (GoldCustomer)customerE;
			System.out.println(customerE.showCustomerInfo());
		}
	
	}
}
/*
 하위 클래스에서 메서드 재정의 하기
 오버라이딩(overriding):상위 크래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는경우 하위 클래스에서 제정의 가능

 */