package de.demmer.dennis;

import java.util.Iterator;

public class Zahlenkette implements Iterable<Integer>{
	
	
	private int[] intArray = {1,2,3,4,5};

	@Override
	public Iterator<Integer> iterator() {
		
	
		return new Iterator<Integer>() {

			int pos = 0;
			
			@Override
			public boolean hasNext() {
				
				
				return pos < intArray.length;
			}

			
			@Override
			public Integer next() {
				
				int current = intArray[pos];
				pos++;
				
				return current;
			}
			

		};
	}
	
	


}
