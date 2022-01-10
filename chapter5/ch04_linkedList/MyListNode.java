package ch04_linkedList;

public class MyListNode {
	private String data;  //�ڷ�
	public MyListNode next; //���� ��带 ����Ű�� ��ũ
	
	public MyListNode() {
		data = null;
		next = null;
	}
	
	public MyListNode(String data) {
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link) {
		this.data = data;
		this.next = link;
	}
	
	public String getData() {
		return data;
	}
}
/*
 LinkedList
 - ������ ������ Ÿ���� ������ ���� �����ϴ� �ڷ� ����
 - �ڷḦ �����ϴ� ��忡�� �ڷ�� ���� ��Ҹ� ����Ű�� ��ũ(������)�� ����
 - �ڷᰡ �߰� �ɶ� ��� ��ŭ�� �޸𸮸� �Ҵ� �ް� ���� ����� ��ũ�� ������(������ ũ��x)
 - ���Ḯ��Ʈ�� i��° ��Ҹ� ã�°� �ɸ��� �ð��� ����� ������ ���
 - jdk Ŭ����: LinkedList
 */
