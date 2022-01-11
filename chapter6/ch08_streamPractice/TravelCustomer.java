package ch08_streamPractice;

public class TravelCustomer {
	
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age , int price) {
	this.name =name;
	this.age = age;
	this.price = price;
	}

	String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	int getPrice() {
		return price;
	}

	private void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "name :" + name+" age:"+age+" price :"+price;
	}
	
	
}