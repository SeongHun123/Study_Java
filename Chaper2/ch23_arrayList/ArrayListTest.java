package ch23_arrayList;

import java.util.ArrayList;

import ch21_objectarray.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("�¹���1","������"));
		library.add(new Book("�¹���2","������"));
		library.add(new Book("�¹���3","������"));
		
		
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
/*
 Array List�� �ֿ� �޼���
 - boolean add(E e) = ��� �ϳ��� �迭�� �߰��մϴ�. E�� ����� �ڷ����� �ǹ��մϴ�.
 - int size() = �迭�� �߰��� ��� ��ü ������ ��ȯ�մϴ� 
 - E get(int index) = �迭�� index ��ġ�� �ִ� ��� ���� ��ȯ
 - E remove(int index) = �迭�� index ��ġ�� �ִ� ��� ���� �����ϰ� �� ���� ��ȯ
 - boolean isEmpty() = �迭�� ����ִ��� Ȯ���ϴ� �޼���
 
 */


 