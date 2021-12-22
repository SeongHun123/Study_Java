package ch03;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agendId;
	
/*	public VIPCustomer() {
		//하위 클래스가 상위클래스의 인스턴스의 참조값을 가지게됨
		super();
		
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		System.out.println("VIPCustomer call");
	}
*/
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
	}
	
	public String getAgentId() {
		return agendId;
	}
}
