package d05_08_2022;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {
		
//		Napisati program koji tacan broj pregleda ispisuje u kracem formatu
//		do 1000 pregleda ispisuje se tacan broj. Npr: 265 views
//		Od 1k do 1m ispisuje se sa sufiksom K. Nor ako je tacan broj pregleda 361518 ispisuje se 361K views
//		Preko 1m ispisuje se sa sufiksom M. Npr: ako je tacan broj 27151528 ispisuje se 27M views
//		Korisnik sa tastature unosi tacan broj pregleda koje program ispisuje u kracem zapisu (edited) 
		
		
		Scanner s = new Scanner(System.in);
		String views;
		System.out.println("Unesite tacan broj pregleda: ");
		int x = s.nextInt();
		views = x + ""; 
//		views = String.valueOf(x);
//		views = Integer.toString(x);
//		views = String.format("%d",x);
		
		
		if (x>999 && x<1000000) {
			x = x/1000;
			views = (x + "K");
		}
		else if (x>999999) {
			x = x/1000000;
			views = (x + "M");
		}
		System.out.println(views + " views");
	}

}
