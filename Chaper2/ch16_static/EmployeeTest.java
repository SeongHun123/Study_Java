package ch16_static;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee empolyeeLee = new Employee();
		empolyeeLee.setEmpolyeeName("이순신");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeekim = new Employee();
		employeekim.setEmpolyeeName("김유신");

		
		System.out.println(empolyeeLee.getEmpolyeeName()+"님의 사번은"+empolyeeLee.getEmpolyeeId());
		System.out.println(employeekim.getEmpolyeeName()+"님의 사번은"+employeekim.getEmpolyeeId());
	}

}
	