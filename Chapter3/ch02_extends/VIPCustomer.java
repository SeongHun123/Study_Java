package ch02_extends;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agendId;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public String getAgentId() {
		return agendId;
	}
}
