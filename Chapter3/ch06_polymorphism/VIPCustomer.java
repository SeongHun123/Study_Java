package ch06_polymorphism;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agendId;

	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
	}
	
	@Override
	public int salePrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price* salesRatio);
		return price;
	}

	public String getAgentId() {
		return agendId;
	}
}
