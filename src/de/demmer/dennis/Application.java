package de.demmer.dennis;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {
	
	public static void main(String[] args) {
		
//		int zufallsZahl = new Random().nextInt(101);
		
		Zahlenkette zahlenkette = new Zahlenkette();
//		zahlenkette.intArray[0] = 5;
//		zahlenkette.getIntArray()[0] = 5;
		
		
		
		
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		liste.add(25);
		liste.add(234);
		liste.add(45234);
		liste.add(11);
		liste.add(14);

		liste.get(0);
		liste.size();
		
//		for (int i = 0; i < liste.size(); i++) {
//			System.out.println(liste.get(i));
//		}
		
		
		Iterator<Integer> it = liste.iterator();
		
		
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
		
		
		
		while(it.hasNext()) {
			if(it.next() == 234) {
				it.remove();
			}
			
			
//			Array ist gekapselt. Zuweisung nicht möglich
//			it.next() = 4;
		}
	
	
		
		
		Glumanda glumanda = new Glumanda();
		glumanda.hp = 20;
		
		Trank trank = new Trank();
		
		Renderer renderer = new Renderer();
//		renderer.render(glumanda);		
//		renderer.render(trank);

		
		
		Zahlenkette z = new Zahlenkette();
		
		Iterator<Integer> it1 = z.iterator();


		
		for(Integer i2 : z) {
			
			System.out.println(i2);
		}
		
		
		while(it1.hasNext()) {
			int i2 = it1.next();
			System.out.println(i2);
		}
		
		
		
	}

}
