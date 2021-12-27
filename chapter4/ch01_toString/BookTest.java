package ch01_toString;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	// 객체에 대한 정보를 표현할때 toString 메서드 활용
	
	@Override
	public String toString() {
		return title+","+author;
	}
	
	
}

public class BookTest{
	public static void main(String[] args) {
		Book book = new Book("데미안","헤르만 허세");
		
		System.out.println(book);
		
		
		String str = new String("test");
		System.out.println(str);
	}
}
/*
 to String()메서드
 - 객체의 정보를 String으로 바꾸어서 사용할 때 쓰임
 - String이나 Integer클래스는 이미 재정의 되어 있음
 */