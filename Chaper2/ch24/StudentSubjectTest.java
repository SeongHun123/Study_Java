package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("����",100);
		studentLee.addSubject("����", 50);
		
		Student studentkim = new Student(1002,"Kim");
		
		studentkim.addSubject("����", 70);
		studentkim.addSubject("����", 85);
		studentkim.addSubject("����", 100);
		
		studentLee.showScoreInfo();
		System.out.println("============");
		studentkim.showScoreInfo();
	}

}
