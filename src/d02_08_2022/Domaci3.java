package d02_08_2022;

import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite ID (broj): ");
		String id = s.nextLine();
		
		System.out.print("Unesite Title: ");
		String title = s.nextLine();
		
		System.out.print("Unesite Severity: ");
		String severity = s.nextLine();
		
		System.out.print("Unesite Priority: ");
		String priority = s.nextLine();
		
		System.out.print("Unesite Description: ");
		String description = s.nextLine();
		
		System.out.print("Unesite Environment: ");
		String environment = s.nextLine();
		
		System.out.print("Unesite Steps to reproduce: ");
		String steps = s.nextLine();
		
		System.out.print("Unesite Expected result: ");
		String expected = s.nextLine();
		
		System.out.print("Unesite Actual result: ");
		String actual = s.nextLine();
		
		System.out.println();
		System.out.println("- ID: " + id);
		System.out.println("- Summary: " + title);
		System.out.println();
		System.out.println("- Environment, affected version: ");
		System.out.println("  " + environment);
		System.out.println();
		System.out.println("- Steps to reproduce the defect:");
		System.out.println("  " + steps);
		System.out.println();
		System.out.println("- Actual result:");
		System.out.println("  " + actual);
		System.out.println();
		System.out.println("- Expected result:");
		System.out.println("  " + expected);
		System.out.println();
		System.out.println("- Description: " + description);
		System.out.println();
		System.out.println("- Severity: " + severity);
		System.out.println();
		System.out.println("- Priority: " + priority);
		System.out.println();
		System.out.println("* Reported by: Svetolik Kljajic");
		
///		Pokusao da odstampam najslicnije primeru koji smo vec imali: https://prnt.sc/pQhEuVqk_-aM
		
		
		

	}

}
