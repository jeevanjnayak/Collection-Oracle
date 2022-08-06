package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * Program to perform all HashMap operations.
 * Hashing is the process of converting object into the integer value.
 * The Integer value help in indexing and search faster.
 * HashMap implements the Map interface.
 * HashMap contains an array of the nodes, and node is represented as a class
 * It uses array and LinkedList internally for storing key and value.
 * LinkedHashMap maintains insertion order.
 */
public class HashMaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Creating the Object of Map function.
		 * Where storing the Integer and String Values.
		 * Duplicate Key are not allowed.
		 * it contains null key and value.
		 * Only one key can be a null but multiple values can be null.
		 * */
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		/*
		 * Inserting the Key and its value into the map
		 */
		System.out.println("All Hashmap  keys and values ");
		hashmap.put(1,"Virat");
		hashmap.put(2,"Sachin");
		hashmap.put(null,"MSD");
		hashmap.put(3,"Rohit");
		hashmap.put(4,"Jasprit");
		hashmap.put(5,"Yuvi");
		hashmap.put(6,"Risabh");
		/*
		 * Using the Iterator Fetching All Map records means its Key and it's Values.
		 * entrySet() ===> returns the collection view from the map which is containing
		 */
		System.out.println(hashmap);
		
		for(Map.Entry m:hashmap.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		/*
		 * Retrieving the Keys present into the Map.
		 */
		
		System.out.println("\nDisplying only keys present: ");
		System.out.println(hashmap.keySet());
		/*
		 * Retrieving only Values present into the Map.
		 */
		System.out.println("\nDisplying Only Values from the map:");
		System.out.println(hashmap.values());
		/*
		 * Taking user input to search the value by using entered key.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter key to search value: ");
		int searchKey = sc.nextInt();
		System.out.println(hashmap.get(searchKey));
		/*
		 * Replacing the value by using key.
		 */
		System.out.println("\nReplacing the value from given key:");
		System.out.println(hashmap.replace(3, "Rohit"));
		for(Map.Entry m:hashmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		/*
		 * Adding key and Value if the Key does not exist into the map.
		 */
		System.out.println("\nAdding new Records into the map: ");
		hashmap.putIfAbsent(4, "Jasprit");
		hashmap.putIfAbsent(8, "umesh");
		for(Map.Entry m:hashmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		/*
		 * Removing key and value from Map by using key
		 */
		System.out.println("\nDeleting Record by Key:");
		hashmap.remove(1);
		for(Map.Entry m:hashmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		/*
		 * Removing key and value from map by using key and value
		 */
		System.out.println("\nDeleting the Record by its Key and value");
		hashmap.remove(2, "MSD");
		for(Map.Entry m:hashmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
