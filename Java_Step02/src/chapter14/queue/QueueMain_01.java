package chapter14.queue;

import java.util.ArrayList;

class MyQueue{

	ArrayList<String> arrayQueue = new ArrayList<String>();
	public void enqueue(String data) {
		// TODO Auto-generated method stub
		arrayQueue.add(data);
		
	}
	public String dequeue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}
		return arrayQueue.remove(0);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return arrayQueue.toString(); 
	}
	
}//MyQueue
public class QueueMain_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue queue = new MyQueue();
		
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		
		System.out.println(queue.toString());

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

		System.out.println(queue.toString());
	}

}
