package ch21_objectarray;

public class ObjeectCopy {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		
		library[0] = new Book("ÅÂ¹é»ê¸Æ1","Á¤¼ºÈÆ");
		library[1] = new Book("ÅÂ¹é»ê¸Æ2","Á¤¼ºÈÆ");
		library[2] = new Book("ÅÂ¹é»ê¸Æ3","Á¤¼ºÈÆ");
		library[3] = new Book("ÅÂ¹é»ê¸Æ4","Á¤¼ºÈÆ");
		library[4] = new Book("ÅÂ¹é»ê¸Æ5","Á¤¼ºÈÆ");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		System.out.println("==library==");
		for(Book book:library) {
			System.out.println(book);
			book.showInfo();
		}
		System.out.println("==Coppy library==");
		for(Book book :copyLibrary) {
			System.out.println(book );
			book .showInfo();
		}
		
		library[0].setAuthor("¹Ú¿Ï¼­");
		library[0].setTitle("³ª¸ñ");
		
		System.out.println("==library==");
		for(Book book:library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("==Coppy library==");
		for(Book book :copyLibrary) {
			System.out.println(book );
			book .showInfo();
		}

	}

}
