package Unit_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* We have 2 iterators in Java:
 	* Iterator: next(), hasNext(), remove();
 	* ListIterator: Iterator + previous(), hasPrevious(), access next and previous index;
 * */
public class IteratorAndListIterator {
	public static void main(String[] args) {

		iterator();
		listIterator();

	}

	static void iterator() {
		System.out.println("######Iterator#####");
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		i.remove();

		i = list.iterator();
		System.out.println("After using iterator.remove()");

		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	static void listIterator() {
		System.out.println("######ListIterator#####");
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		ListIterator<Integer> i = list.listIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("Traverse backward");
		
		while (i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}
}