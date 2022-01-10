package ch06_queue;

public class MyListQueueTest {

	public static void main(String[] args) {
		MyLinkedQueue listQueue = new MyLinkedQueue();
		listQueue.enQueue("A");
		listQueue.enQueue("B");
		listQueue.enQueue("C");
		listQueue.enQueue("D");
		
		listQueue.printAll();
		
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());
	}

}
