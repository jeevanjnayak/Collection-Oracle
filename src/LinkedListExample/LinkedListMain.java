package LinkedListExample;

import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Linked List");
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		LinkedList list2 = new LinkedList();
		list2.add(40);
		list2.add(50);
		list2.add(55);
		/*
		 * Adding new another list into the previous list.
		 */
		list.addAll(list2);
		System.out.println(list2);
		System.out.println(list);	
		/*
		 * Iterating list elements.
		 */
		for(Object li:list) {
			System.out.println(li);
		}
		/*
		 * We can Add the element at the given location.
		 */
		list.add(1,70);
		/*
		 * 
		 * If we try to add element on same location the first element sift next by 1 and new element takes its location.
		 * 
		 */
		list.add(1, 60);
		list.add(1,80);
		System.out.println(list);
		/*
		 * Adding new element at the first of the list.
		 */
		list2.addFirst(00);
		System.out.println(list2);
		/*
		 * Adding new element at the end of the list.
		 */
		list2.addLast(100);
		System.out.println(list2);
		/*
		 * adding list2 at the given location into the list.
		 */
		list.addAll(5, list2);
		System.out.println(list);
		/*
		 * Removing the element by given position.
		 */
		list2.remove(0);
		System.out.println(list2);
		/*
		 * removeFirst method remove the first element of the list.
		 */
		list2.removeFirst();
		System.out.println(list2);
		/*
		 * Removing the element which is at the start of the list.
		 */
		list2.remove();
		System.out.println(list2);
		/*
		 * Removing the element by giving its value.
		 */
		list2.remove("100");
		System.out.println(list2);
		/*
		 * Removing the element from the last of the list.
		 */
		list2.removeLast();
		System.out.println(list2);
	}
}
