package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		int a[] = new int[3];

		// Dynamic Array --> ArrayList
		// Can contain duplicate elements
		// Maintains insertion order
		// It is not synchronised --> threading is not possible
		// Allows random access to fetch any element using index
		// to retrieve/print all values of arrayList --> use for loop or iterator

		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add("Tom");
		System.out.println(ar.size());
		ar.add(20);
		ar.add('A');
		System.out.println(ar.size());
		System.out.println(ar.get(3)); // to get value store on index 4

		// Generic & Non-Generic in Java

		ArrayList ar1 = new ArrayList(); // This is a non-generic type because it has not been specified as to what all
											// data-types can be stored in this array list.

		ArrayList<Integer> ar2 = new ArrayList<Integer>(); // This is generic type as it has been specified that only
															// integer data type values can be stored in this array
															// list.

		// Printing all values of an ArrayList:
		// 1. for Loop --> already done
		// 2. Iterator --> refer below

		// Employee class objects

		Employee e1 = new Employee("Naveen", 25, "QA");
		Employee e2 = new Employee("Tom", 23, "Dev");
		Employee e3 = new Employee("Jerry", 25, "Admin");

		// create arraylist

		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);

		// using iterator to iterate

		Iterator<Employee> it = ar3.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		System.out.println("*****************");
		// addAll()
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Test");
		ar4.add("Selenium");
		ar4.add("QTP");

		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Dev");
		ar5.add("JAVA");
		ar5.add("JavaScript");

		ar4.addAll(ar5);
		for (int i = 0; i < ar4.size(); i++) {
			System.out.println(ar4.get(i));
		}

		System.out.println("****************");
		// removeAll
		ar4.removeAll(ar5);
		for (int i = 0; i < ar4.size(); i++) {
			System.out.println(ar4.get(i));
		}

		System.out.println("****************");
		// retainAll
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Test");
		ar7.add("Selenium");
		ar7.add("QTP");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Test");
		ar8.add("JAVA");

		ar7.retainAll(ar8);
		for (int i = 0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i));

		}

	}
}
