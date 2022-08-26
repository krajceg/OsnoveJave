package Vezbe;

import java.util.Scanner;

public class testiram1 {

	public static void main(String[] args) {
				
//		 2. Napisati program koji proverava da li je kliknuto u okviru login forme za
//		  web stranicu. Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati
//		  odgovarajuce poruke. Primer izvrsenja 1: Unesite x za T1: 10 Unesite y za T1:
//		  100 Unesite x za T2: 100 Unesite y za T2: 0 Unestie x za M: 50 Unesite y za
//		  M: 50 Kliknuto je unutar forme
		 

		Scanner s = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3;
		
		System.out.print("Uneti kordinatu x za T1: ");
		x1 = s.nextDouble();
		System.out.print("Uneti kordinatu y za T1: ");
		y1 = s.nextDouble();
		
		System.out.print("Uneti kordinatu x za T2: ");
		x2 = s.nextDouble();
		System.out.print("Uneti kordinatu y za T2: ");
		y2 = s.nextDouble();
		
		System.out.print("Uneti kordinatu x za M: ");
		x3 = s.nextDouble();
		System.out.print("Uneti kordinatu y za M: ");
		y3 = s.nextDouble();

		
		
		if ((x3>=x1 && x3<=x2) || (x3>=x2 && x3<=x1)) {
			if ((y3>=y1 && y3<=y2) || (y3>=y2 && y3<=y1)) {
				System.out.println("Kliknuto je unutar polja.");
			}
		}
		else {
			System.out.println("Nije kliknuto unutar forme.");
		}

	}
}
