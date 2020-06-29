package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print
		System.out.println("Contents of linkedlist: "+ ll);
		
		//addFirst
		ll.addFirst("Naveen");
		ll.addLast("Automation");
		System.out.println("Contents of linkedlist after edit: "+ ll);
		
		//get:
		System.out.println(ll.get(0));
		
		//set
		ll.set(0, "Abhay");
		System.out.println(ll.get(0));
		
		//remove
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		
		ll.remove(0);
		System.out.println(ll);
		System.out.println();
		
		//Printing all the values of linkedList
		//1. using for Loop
		System.out.println("Pinting usig for loop");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		System.out.println();
		
		//2. using advance for loop
		System.out.println("Printing using advance for loop");
		for(String str:ll) {
			System.out.println(str);
		}
		System.out.println();
		
		//3. using iterator
		System.out.println("Printing using iterator");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		//4. using while loop
		System.out.println("Printing using while loop");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
	}

}