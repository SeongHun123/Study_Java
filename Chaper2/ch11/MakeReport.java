package ch11;

public class MakeReport {
	//StringBuffer ���ڿ��� �߰��ϰų� �����Ҷ� ���� �ڷ��� +�� �ϴ°� �޸𸮸� ���� ��Ƹӱ⶧���� �ַ� �̰� ��
	StringBuffer buffer = new StringBuffer();
	
	private String line = "==========================\n";
	private String title = "�̸�\t �ּ� \t\t  ��ȭ��ȣ \n ";
	private void makeHeader() 
	{
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody()
	{
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-0987\n");
	}
	private void makeFooter() 
	{
		buffer.append(line);
	}
	
	public String getReport() 
	{
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
/*
 ĸ��ȭ(encapsulation)
 ���� ������ Ȱ���� ĸ��ȭ
 - �� �ʿ��� ������ ��ɸ� �ܺο� ����
 - ��κ��� ��� ������ �޼��带 ���߰� �ܺο� ���յ� �������̽����� �����Ͽ� �ϰ��� ��� ����
 - ������ �޼��峪 ��� ������ ���������ν� �߻��ϴ� ������ �ּ�ȭ
 */