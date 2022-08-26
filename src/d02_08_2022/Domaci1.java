package d02_08_2022;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite ime: ");
		String ime = s.nextLine();
		
		System.out.print("Unesite prezime: ");
		String prezime = s.nextLine();
		
		/// Ako probam da unesem sa razmacima sve zivo se raspadne i izbaci par nekih errora vezano za Scanner i premesti pola stvari.
		/// Bukvalno ime bude iz cista mira u liniji 3, pola zvezdica fali, takodje te iste brojeve sa kartice skrati.
		/// Probao sam da resetujem program, da obrisem file pa da pravim novi, preimenovao sam ga, probao sam cak i novi package da napravim.
		/// Ne znam sta je problem, ne znam ni kako da ga popravim. Za sada radi samo ako unesem 16 cifara spojeno u slucaju da koristim .next
		
		/// Ako koristim .nextLine nema nikakvih problema :)
		
		System.out.print("Unesite broj kartice: ");
		String broj = s.nextLine();
		
		System.out.print("Unesite mesec do kada vazi kartica: ");
		int mesec = s.nextInt();
		
		System.out.print("Unesite godinu do kada vazi kartica: ");
		int godina = s.nextInt();
		
		System.out.println();
		System.out.println("***********************************");
		System.out.println("*  Credit Card                    *");
		System.out.println("*    ****                         *");
		System.out.println("*    ****                         *");
		System.out.println("*       " + broj + "       *");
		System.out.println("*                   valid > " + mesec + "/" + godina + " *");
		System.out.println("*                                 *");
		System.out.println("*  " + ime + " " + prezime + "               *");
		System.out.println("***********************************");
		
		

	}

}
