package ch02_extends;

public class Customer {
	//protected == 하위클래스에서는 접근 가능하지만 외부클래스에서는 접근 불가능
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
		return customerName + "님의 등급은"+customerGrade+"이며, 보너스 포인트는"+bonusPoint+"입니다.";
	}
	
}
