package ch02_equals_hashCode;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		//�ּҰ� ����
		Student std3 = std1;
		//���� �ּҰ��� �ٸ����� �������� ���⶧���� ���ٰ� ��ȯ�� ��
		System.out.println(std1==std2);
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		//���� �ؽ��ڵ尪 ����ϴ� �޼���
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		System.out.println(System.identityHashCode(std3));
		//�����ϴ°� �ƴ϶� �����ϴ� �޼���
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
//		//Integer�� hash�ڵ带 ������ ������ ���� ����
//		Integer i = 100;
//		System.out.println(i.hashCode());
	}

}
