package ch02_equals_hashCode;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		//주소값 복사
		Student std3 = std1;
		//실제 주소값은 다르지만 논리적으로 같기때문에 같다고 반환이 댐
		System.out.println(std1==std2);
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		//실제 해시코드값 출력하는 메서드
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		System.out.println(System.identityHashCode(std3));
		//생성하는게 아니라 복사하는 메서드
		std1.setStudentName("kim");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
		
//		
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		System.out.println(str1.equals(str2));
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());		
//		
//		//Integer은 hash코드를 찍으면 저장한 값이 나옴
//		Integer i = 100;
//		System.out.println(i.hashCode());
	}

}
