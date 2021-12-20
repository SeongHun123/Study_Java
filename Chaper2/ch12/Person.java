package ch12;

public class Person {
	String name;
	int age;
	
	public Person()
	{
		this("������",24);
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public void showPerson()
	{
		System.out.println(name+","+age);
	}
	
	public Person getPerson() {
		return this;
	}
	public static void main(String[] args) {
		
		Person person = new Person();
		person.showPerson();
		
		
		System.out.println(person);
		
		Person person2 = person.getPerson();
		System.out.println(person2);
	}
}
/*
 ��ü �ڽ��� ����Ű�� This
 This �� �ϴ���
 - �ν��Ͻ� �ڽ��� �޸𸮸� ����Ŵ
 - �����ڿ��� �� �ٸ� �����ڸ� ȣ�� �Ҷ� ���
 - �ڽ��� �ּ�(������)�� ��ȯ ��
 
 �����ڿ��� �ٸ� �����ڸ� ȣ�� �ϴ� This
 - Ŭ������ �����ڰ� ���� �� �ΰ��, this�� �̿��Ͽ� �����ڿ��� �ٸ� �����ڸ� ȣ���� �� ����
 - �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� ���, �ν��Ͻ��� ������ �������� ���� �����̹Ƿ� this()statement ������ �ٸ� statement�� ���� ����
 */