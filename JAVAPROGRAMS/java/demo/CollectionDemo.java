package demo;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Collection values=new ArrayList();
		values.add(3);
		values.add(5);
		values.add(8);
		values.add("alpha");
		
		Iterator it=values.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		


	}

}
