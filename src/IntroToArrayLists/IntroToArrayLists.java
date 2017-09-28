package IntroToArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		ArrayList<String> arrays = new ArrayList();
		// Don't forget to import the ArrayList class

		// 2. Add five Strings to your list
		arrays.add(" yes");
		arrays.add("pink");
		arrays.add("sam ");
		arrays.add("awesome");
		arrays.add("igloo");

		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < arrays.size(); i++) {
			String s = (String) arrays.get(i);
			System.out.println("String at element " + i + " " + s);
		}

		// 4. Print all the Strings using a for-each loop
		for (String s : arrays) {
			
			System.out.println(s);
		}

		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < arrays.size(); i += 2) {
			System.out.println(arrays.get(i));

		}
		// 6. Print all the Strings in reverse order.
for (int i = 0; i < arrays.size(); i-- ) {
	System.out.println(arrays.get(i));
	
}
		// 7. Print only the Strings that have the letter 'e' in them.
for (int i = 0; i < args.length; i++) {

}
	}
}
