package ch16_static;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee empolyeeLee = new Employee();
		empolyeeLee.setEmpolyeeName("�̼���");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeekim = new Employee();
		employeekim.setEmpolyeeName("������");

		
		System.out.println(empolyeeLee.getEmpolyeeName()+"���� �����"+empolyeeLee.getEmpolyeeId());
		System.out.println(employeekim.getEmpolyeeName()+"���� �����"+employeekim.getEmpolyeeId());
	}

}
	