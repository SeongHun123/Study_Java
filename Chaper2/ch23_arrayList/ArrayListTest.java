package ch23_arrayList;

import java.util.ArrayList;

import ch21_objectarray.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태백산맥1","조정래"));
		library.add(new Book("태백산맥2","조정래"));
		library.add(new Book("태백산맥3","조정래"));
		
		
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
/*
 Array List의 주요 메서드
 - boolean add(E e) = 요소 하나를 배열에 추가합니다. E는 요소의 자로형을 의미합니다.
 - int size() = 배열의 추가된 요소 전체 개수를 반환합니다 
 - E get(int index) = 배열의 index 위치에 있는 요소 값을 반환
 - E remove(int index) = 배열의 index 위치에 있는 요소 값을 제거하고 그 값을 반환
 - boolean isEmpty() = 배열이 비어있는지 확인하는 메서드
 
 */


 