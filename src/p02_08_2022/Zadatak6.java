package p02_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unestite ime: ");
		String ime = s.next();
		System.out.print("Unesite prezime: ");
		String prezime = s.next();
		System.out.print("Unesite broj telefona: ");
		String broj = s.next();
		System.out.print("Unesite email: ");
		String email = s.next();
		System.out.print("Unesite JMBG: ");
		String jmbg = s.next();
		
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println(ime + " " + prezime + " - " + jmbg);
		System.out.println("Broj tel: +" + broj);
		System.out.println("Email: " + email);
		

	}

}
