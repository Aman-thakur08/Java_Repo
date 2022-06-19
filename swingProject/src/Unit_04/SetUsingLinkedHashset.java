package Unit_04;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* {Set}
 * No Duplicates
 * at most one null element
 * 
 * {LinkedHashset}
 * Inside, It uses doubly-linked list
 * Preserve insertion order 
 * */

public class SetUsingLinkedHashset {

	public static void main(String[] args) {

		// Set demonstration using HashSet
		Set<String> hash_Set = new LinkedHashSet<String>();

		hash_Set.add("Akash");
		hash_Set.add("Chauhan");
		hash_Set.add("Akash");
		hash_Set.add("Akash");
		hash_Set.add("Akash");
		hash_Set.add("Akash");
		hash_Set.add("Akash");
		hash_Set.add("Singh");
		hash_Set.add("Set");
		hash_Set.add(null);
		hash_Set.add(null);/* It would not make sense, as at most one null element is allowed */

		System.out.print("Set output without the duplicates!");

		System.out.println(hash_Set);

		//Remove null value from the set
		hash_Set.remove(null);
		
		System.out.print("Set output after null is removed!");
		System.out.println(hash_Set);


	}

}
