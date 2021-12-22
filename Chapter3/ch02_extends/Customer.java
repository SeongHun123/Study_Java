package ch02_extends;

public class Customer {
	//protected == ����Ŭ���������� ���� ���������� �ܺ�Ŭ���������� ���� �Ұ���
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	public int salePrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� �����"+customerGrade+"�̸�, ���ʽ� ����Ʈ��"+bonusPoint+"�Դϴ�.";
	}
	
}
