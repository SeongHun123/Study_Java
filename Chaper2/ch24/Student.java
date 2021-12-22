package ch24;

import java.util.ArrayList;

public class Student {
		int studentId;
		String studentName;
		ArrayList<Subject> subjectlist;
		
		public Student(int studnetId, String studentName) {
			this.studentId = studnetId;
			this.studentName = studentName;
			
			subjectlist = new ArrayList<Subject>();
		}
		
		public void addSubject(String Name, int Score) {
			Subject subject = new Subject();
			
			subject.setSubjectName(Name);
			subject.setSubjectScore(Score);
			subjectlist.add(subject);
		}
		
		public void showStudentInfo() {
			int total = 0;
			
			for(Subject s : subjectlist) {
				
				total += s.getSubjectScore();
				System.out.println(studentName+"학생의"+s.getSubjectName()+"과목의 성적은"+s.getSubjectScore()+"입니다.");
			}
			System.out.println(studentName+"학생의 총점은"+total+"입니다.");
		}
}
