package ch03;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agendId;
	
/*	public VIPCustomer() {
		//���� Ŭ������ ����Ŭ������ �ν��Ͻ��� �������� �����Ե�
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
