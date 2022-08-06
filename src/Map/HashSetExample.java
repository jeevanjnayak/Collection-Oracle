package Map;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * In HashSet Objects are inserted by using hashCode therefore it is not stored in ordersed and also
 * 	returned in any ordered.
 * Null elements are allowed in hashSet
 */
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet<>();
		hash.add(10);
		hash.add(20);
		hash.add(30);
		hash.add(40);
		hash.add(50);
		hash.add(60);
		
		System.out.println(hash);
		
		if(hash.contains(40)) {
			System.out.println("Hash Set contains the value 40");
		}
		else {
			System.out.println("It does not contains the value");
		}
		System.out.println(hash.hashCode());
	}

}
