package de.demmer.dennis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {

		// STRG + SHIFT + O
		List<String> stringList = new ArrayList<>();
		
		stringList.add("Test0");
		stringList.add("Test1");
		stringList.add("Test2");
		stringList.add("Test3");
		stringList.add("Test4");
		
		

		Iterator<String> iterator = stringList.iterator();

		
		while(iterator.hasNext()) {
			String current = iterator.next();
			iterator.remove();
//			System.out.println(current);

		}
		
		
		for(String current : stringList) {
			System.out.println(current);
		}
		
		
		//------------------------------------------------
		
		
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 40 ; i++) {
			intList.add(50);			
		}

		System.out.println(intList.size());
		
		
		
		
		List<Integer> temp = new ArrayList<Integer>();

		for(int i = 0; i < intList.size(); i++) {
			if(intList.get(i) == 50 ) {
				//speichern in neue Liste
				temp.add(intList.get(i));
			}
		}

		intList.removeAll(temp);
		
		
		


		

	}

}
