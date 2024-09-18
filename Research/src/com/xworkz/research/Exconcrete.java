package com.xworkz.research;

public class Exconcrete {
	Here are 20 inbuilt concrete classes in Java:
		1. String (java.lang) - represents a sequence of characters
		2. Integer (java.lang) - wraps a primitive int value
		3. Double (java.lang) - wraps a primitive double value
		4. Boolean (java.lang) - wraps a primitive boolean value
		5. ArrayList (java.util) - resizable-array implementation of the List interface
		6. LinkedList (java.util) - doubly-linked list implementation of the List interface
		7. HashMap (java.util) - hash table implementation of the Map interface
		8. HashSet (java.util) - hash table implementation of the Set interface
		9. TreeSet (java.util) - tree implementation of the Set interface
		10. TreeMap (java.util) - tree implementation of the Map interface
		11. PriorityQueue (java.util) - unbounded priority queue
		12. StringTokenizer (java.util) - splits strings into tokens
		13. Date (java.util) - represents a specific instant in time
		14. Calendar (java.util) - provides methods for manipulating dates
		15. Random (java.util) - generates random numbers
		16. Scanner (java.util) - parses input from various sources
		17. PrintWriter ((link unavailable)) - writes formatted representations of objects
		18. BufferedReader ((link unavailable)) - reads text from a character-input stream
		19. FileInputStream ((link unavailable)) - reads bytes from a file
		20. JOptionPane (javax.swing) - provides methods for creating dialog boxes


		These concrete classes can be used for various purposes such as:


		- Data structures (lists, sets, maps)
		- File I/O operations
		- Networking
		- GUI programming
		- Date and time manipulation
		- Random number generation
		- Parsing input
		- Creating dialog boxes

		import java.util.ArrayList;

		public class Main {
		    public static void main(String[] args) {
		        ArrayList<String> list = new ArrayList<>();
		        list.add("Apple");
		        list.add("Banana");
		        list.add("Cherry");
		        
		        System.out.println(list); // Output: [Apple, Banana, Cherry]
		    }
		}
}
