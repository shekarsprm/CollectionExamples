package com.nacr.collections;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

/**
 * 
 * Vector class also represents the list of objects under resizable array
 * fashion. Its underlying data structure is also dynamic array. It is a legacy
 * class. It allows duplicate elements to be inserted. It allows n number of
 * null values. It preserves the insertion order. It allow heterogeneous object
 * For retrieval purpose Vector is the best choice It is synchronized. Every
 * method in the vector is synchronized. So it is thread safe.
 * ===============================================================>>>><<<<<=====
 * =====
 * 
 * Stack class is the child class of Vector. It follows LIFO (Last in first out)
 * mechanism. It is the stack implementation in java Constructors Stack v =
 * Stack(); It creates an empty Stack.
 * 
 * @author Welcome
 *
 */
public class VectorAndStatckExamples {

	public static void vector() {

		// CREATION

		Vector v = new Vector();

		// INSERTION

		// Insertion by addElement method

		v.addElement(25); // Inserting number index: [0]

		v.addElement("java"); // Inserting String index: [1]

		v.addElement(true); // Inserting boolean index: [2]

		// RETRIEVAL

		// Printing Whole list in single line

		System.out.println("Vector contents " + v);

		// Printing all the elements using Iterator

		Iterator it = v.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		// Fetching element at particular index

		System.out.println("Element at index 2 is " + v.elementAt(2));

		// Size of ArrayList

		System.out.println("Capacity is " + v.capacity());

		// DELETION

		// Removing the element at index 3

		v.removeElementAt(2);

		System.out.println("Vector contents after removal " + v);

		// Removing all the elements

		v.removeAllElements();

		System.out.println("Vector size after clear " + v.size());

	}

	public static void stack() {
		// CREATION

		Stack st = new Stack();
	
		// PUSH
		// Insertion by push method

		st.push(25);

		st.push("java");

		st.push(true);

		// PEEK

		System.out.println(st.peek());

		// POP
		while (!st.empty()) {

			System.out.println("Element: " + st.pop());

		}
	}
}
