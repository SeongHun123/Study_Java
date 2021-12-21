package ch16_static;

public class Employee {
	//������ �Ǵ� ����
	private static int serialNum = 1000;
	
	private int empolyeeId;
	private String empolyeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		empolyeeId = serialNum;
	}
	//�����̵Ǵ� �����ȣ�� Ȯ���ϴ� �޼��� Ȯ���� �Ҽ������� ������ �Ұ��� set�̾��� ����
	//�Ϲ� �޼���ȿ��� static������ ����� ���������� static�������� �ν��Ͻ����� ����ϴ°� �Ұ��� �޸� ����������
	public static int getSerialNum() {
				
		return serialNum;
	}


	public int getEmpolyeeId() {
		return empolyeeId;
	}
	public void setEmpolyeeId(int empolyeeId) {
		this.empolyeeId = empolyeeId;
	}
	public String getEmpolyeeName() {
		return empolyeeName;
	}
	public void setEmpolyeeName(String empolyeeName) {
		this.empolyeeName = empolyeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
/*
 ���� �ν��Ͻ����� �������� ����ϴ� ���� ���� -static ����
 �������� ����ϴ� ������ �ʿ��� ���
 - ���� �ν��Ͻ��� �����ϴ� ���� ���� �ʿ��� ���
 - �л����� ���ο� �й� ����
 - ī��ȸ�翡�� ī�带 ���� �߱��Ҷ����� ���ο� ī�� ��ȣ�� �ο�
 - ȸ�翡 ����� �Ի��Ҷ� ���� ���ο� ����� �ʿ�
 
 static ���� ����� ����ϱ�
 - �ν��Ͻ��� ������ �� ��������� ������ �ƴ�, ó�� ���α׷��� �޸𸮿� �ε��� �� �޸𸮸� �Ҵ�
 - Ŭ���� ����, �������������
 - �ν��Ͻ� ������ ��� ���� ��� �����ϹǷ� Ŭ���� �̸��� ���� ����
 
 static�޼���(Ŭ���� �޼���)������ �ν��Ͻ� ������ ����� �� ����.
 -static �޼���� �ν��Ͻ� ������ �����ϰ� Ŭ���� �̸����� ȣ�� �� �� ����
 - �ν��Ͻ� ���� ���� ȣ�� �� �� �����Ƿ� static�޼��� ���ο����� �ν��Ͻ� ������ ����� �� ����
 
 
������ ��ȿ ������ �޸�
���� ����(���� ����) - �Լ� ���ο� ���� - �Լ� ���ο����� ��� - ���� - �Լ��� ȣ��� �� �����ǰ� �Լ��� ������ �Ҹ�
��� ����(�ν��Ͻ� ����) - Ŭ���� ��� ������ ���� - Ŭ���� ���ο��� ����ϰ� private�� �ƴϸ� ���� ������ �ٸ� Ŭ�������� ��� ���� - ��
- �ν��Ͻ��� ���� �� �� ���� �����ǰ�, ������ �÷��Ͱ� �޸𸮸� �����Ҷ� �Ҹ�
static ����(Ŭ���� ����) - static ���� ����Ͽ� Ŭ���� ���ο� ���� 
-Ŭ���� ���ο��� ����ϰ� private�� �ƴϸ� Ŭ�����̸����� �ٸ� Ŭ������ �� ��� ���� 
- ������ ���� - ���α׷��� ó�� ������ �� ����� �Բ� ������ ������ �����ǰ� ���α׷��� ������ �޸𸮸� �����Ҷ� �Ҹ�

! static������ ���α׷��� �޸𸮿� �ִ� ���� ��� �� ������ �����ϹǷ� �ʹ� ū �޸𸮸� �Ҵ��ϴ� ���� ���� ����
! Ŭ���� ������ ���� �޼��忡�� ����ϴ� ������ ��� ������ �����ϴ� ���� ����
! ��� ������ �ʹ� ������ �ν��Ͻ� ���� �� �������� �޸𸮰� �Ҵ� ��
! ��Ȳ�� �����ϰ� ���� ���

 */