package ch01_toString;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	// ��ü�� ���� ������ ǥ���Ҷ� toString �޼��� Ȱ��
	
	@Override
	public String toString() {
		return title+","+author;
	}
	
	
}

public class BookTest{
	public static void main(String[] args) {
		Book book = new Book("���̾�","�츣�� �㼼");
		
		System.out.println(book);
		
		
		String str = new String("test");
		System.out.println(str);
	}
}
/*
 to String()�޼���
 - ��ü�� ������ String���� �ٲپ ����� �� ����
 - String�̳� IntegerŬ������ �̹� ������ �Ǿ� ����
 */