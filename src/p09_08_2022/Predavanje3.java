package p09_08_2022;

import java.util.ArrayList;

public class Predavanje3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		
		brojevi.add(5);
		brojevi.add(1);
		brojevi.add(4);
		brojevi.add(3);
		
//		int suma = brojevi.get(0) + brojevi.get(1) +...
		brojevi.set(1, 11); // (index, element) - Pozicija 1 se pretvara u 11
		
		brojevi.set(brojevi.size() - 1, 13);


	}

}
