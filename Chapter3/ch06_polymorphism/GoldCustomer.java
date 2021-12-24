package ch06_polymorphism;

public class GoldCustomer extends Customer {
	
	double salesRatio;
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId,customerName);
		
		customerGrade = "GOLD";
		salesRatio = 0.1;
		bonusRatio = 0.02;
	}
	public int salePrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price * salesRatio);
	}
}
