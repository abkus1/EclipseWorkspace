package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h=new Hashtable();
		
		h.put(1, 100); //Syntax--> h.put(key,value); --> any data-type combination can be used for (key,value).
		h.put(2,"TOM");
		h.put("A", 200);
		h.put("B", "Test");
		
		System.out.println(h.size());
		System.out.println(h.get(1));
		System.out.println(h.get("A"));
		
		//To aloow only a particular data-type combination for (key,value), use the syntax below:
		Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
		h1.put(1, 100);
		//h1.put("A", 100); --> this will not be allowd for h1
		
	}

}
