package p02_08_2022;

import java.util.Scanner;

public class TestStringEquals {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite mesto rodjenja: ");
		
		String imeGrada = s.nextLine();
		imeGrada=imeGrada.trim();
		imeGrada=imeGrada.toLowerCase();
		
		String beograd = "beograd";
		
		if (imeGrada.equals(beograd)) {
			System.out.println("Rodjeni ste u glavnom gradu.");
		} else {
			System.out.println("Rodjeni ste u Srbiji.");
		}

	}

}
