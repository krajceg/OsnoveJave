package d09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci5 {

	public static void main(String[] args) {
		
//		Napisati program koji ucitava niz stringova duzine N, tako da ucitavanje elemenata u 
//		niz a bude obrnuto. 
//		Primer:
//		Unesite N: 4
//		Unesite string: xxx1
//		Unesite string: xxx4
//		Unesite string: xxx6
//		Unesite string: xxx9
//
//		Niz a: xxx9, xxx6, xxx4, xxx1
//		Komentar: Stanje niza a u memoriji je:
//			a[0]="xxx9",
//			a[1]="xxx6",
//			a[2]="xxx4",
//			a[3]="xxx1",

		ArrayList<String> a = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		ArrayList<String> b = new ArrayList<String>();
		
		int n;

		do {
			System.out.print("Unesite N: ");
			n = s.nextInt();
		} while (n <= 0);

		for (int i = 0; i < n; i++) {
			System.out.print("Unesite string: ");
			String x = s.next();
			b.add(x);
		}
		for (int i = 0; i < n; i++) {
			a.add(i, b.get(b.size()-1-i));
		}
		System.out.println("Niz A: " + a);
	}
}
