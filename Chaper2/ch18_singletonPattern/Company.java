package ch18_singletonPattern;

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
/*
 �̱��� ����
 - ���α׷����� �ν��Ͻ��� �� �Ѱ��� �����Ǿ�� �ϴ� ��� ����ϴ� ������ ����
 - static ����,�޼��带 Ȱ���Ͽ� ���� �� �� ����
 
 */