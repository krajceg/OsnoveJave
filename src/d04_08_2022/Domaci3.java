package d04_08_2022;

import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {
		/* 3. (Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p 
		(p ima startni deo #) tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
		*/

		
		Scanner s = new Scanner(System.in);
		int a, b, c, d;
		String p;
		p = "#";
		
		System.out.print("Unesite vrednost broja a: ");
		a = s.nextInt();
		
		System.out.print("Unesite vrednost broja b: ");
		b = s.nextInt();
		
		System.out.print("Unesite vrednost broja c: ");
		c = s.nextInt();
		
		System.out.print("Unesite vrednost broja d: ");
		d = s.nextInt();
		
		if (a>=0) {
			p = p + " " + a;
		}
		else {
			p = a + " " + p;
		}
		if (b>=0) {
			p = p + " " + b;
		}
		else {
			p = b + " " + p;
		}
		if (c>=0) {
			p = p + " " + c;
		}
		else {
			p = c + " " + p;
		}
		if (d>=0) {
			p = p + " " + d;
		}
		else {
			p = d + " " + p;
		}
		
		System.out.println("String p ima vrednost = " + p);
	}

}
