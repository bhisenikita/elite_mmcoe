package collections_framework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
		
		que.offer("Apple");
		que.offer("Banana");
		que.offer("Cherry");
		
		System.out.println(que.peek()); // fetch value but doesn't remove
		
		while(!que.isEmpty())
			System.out.println(que.poll());  //fetch value and remove from queue
		
		//write code to implement Dequeue in this example
		
		System.out.println("\nDeQueue");
	
        Deque<String> deque = new LinkedList<String>();
        
        

        // Add elements
        deque.offerFirst("Apple");
        deque.offerLast("Banana");
        deque.offerFirst("Cherry");
        deque.offerLast("Orange");

        System.out.println("Deque: " + deque);

        // Peek elements
        System.out.println("First Element: " + deque.peekFirst());
        System.out.println("Last Element: " + deque.peekLast());

        // Remove elements
        System.out.println("Removed First: " + deque.pollFirst());
        System.out.println("Removed Last: " + deque.pollLast());

        System.out.println("Deque after removal: " + deque);
        
        while(!deque.add(isEmpty)) {
        	System.out.println(deque.pollFirst());w
        }
		
		
				
	}

}
