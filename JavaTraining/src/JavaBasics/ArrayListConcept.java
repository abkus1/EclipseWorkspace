package JavaBasics;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add(100); //0
		ar.add(200); //1
		ar.add(300); //2
		
		System.out.println(ar.size());
		
		ar.add(400); //3
		ar.add(500); //4
		
		System.out.println(ar.size());
		
		ar.add("Tom"); //5
		ar.add("Heloo"); //6
		ar.add(12.33); //7
		ar.add('H'); //8
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		System.out.println(ar.get(8));
		
		//To print all the values in the array list, use for loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		//If you need your array-list to allow only integer values:
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Tom"); --> This will not be allowed and will throw error.
		
		//Similarly you can other create array-lists for to allow only a particular data-type values. 
		
		}
	}

}
