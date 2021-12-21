package ch21_objectarray;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		library[0] = new Book("ÅÂ¹é»ê¸Æ1","Á¤¼ºÈÆ");
		library[1] = new Book("ÅÂ¹é»ê¸Æ2","Á¤¼ºÈÆ");
		library[2] = new Book("ÅÂ¹é»ê¸Æ3","Á¤¼ºÈÆ");
		library[3] = new Book("ÅÂ¹é»ê¸Æ4","Á¤¼ºÈÆ");
		library[4] = new Book("ÅÂ¹é»ê¸Æ5","Á¤¼ºÈÆ");
		
		for(Book book:library) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
