package ch02_equals_hashCode;

public class Student implements Cloneable{
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	public void setStudentName(String name) {
		this.studentName = name;
		
	}
	public String toString() {
		return studentNum + "," + studentName;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(java.lang.Object obj) {
		//다운 캐스팅
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if( this.studentNum == std.studentNum)
				return true;
			else return false;
		}
		return false;
	}

	@Override
	protected java.lang.Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
