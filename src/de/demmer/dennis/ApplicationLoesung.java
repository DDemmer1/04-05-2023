package de.demmer.dennis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ApplicationLoesung {

	public static void main(String[] args) {
		
		//STRG + SHIFT + O -> auto import
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 1000; i++) {
			int zufallsZahl = new Random().nextInt(101);
			list.add(zufallsZahl);
		}

		
		Iterator<Integer> iterator = list.iterator();
		
		
		while(iterator.hasNext()) {
			int current = iterator.next();
			
			if(current > 50) {
				iterator.remove();
			}

		}

		System.out.println(list);
	
		
	}

}
