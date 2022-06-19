package Unit_04;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/*
The ArrayDeque in Java provides a way to apply re-sizable array in addition to the implementation of the Deque interface.
It is also known as Array Double Ended Queue or Array Deck.
This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. 
*/

public class ArrayDequeue {

	public static void main(String[] args) {

		// Creating and initializing deque and Declaring object of integer type
		Deque<Integer> de_que = new ArrayDeque<Integer>(10);

		// Adding custom elements
		de_que.add(10);
		de_que.add(20);
		de_que.add(30);
		de_que.add(40);
		de_que.add(50);

		// Iterating using for each loop
		for (Integer element : de_que) {
			// Print the corresponding element
			System.out.println("Element : " + element);
		}

		// Clearing all elements using clear() method
		de_que.clear();

		// Inserting at the start
		de_que.addFirst(564);
		de_que.addFirst(291);

		// Inserting at end
		de_que.addLast(24);
		de_que.addLast(14);

		for (Iterator itr = de_que.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}

	}

}
