package d04_08_2022;

import java.util.Scanner;

public class Domaci5 {

	public static void main(String[] args) {
//		5. Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature 
//		(operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu odgovarajuci zbir, 
//		razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
		
		
		Scanner s = new Scanner(System.in);
		
		int a, b, rezultat;
		String operator;
		
		System.out.print("Unesite a: ");
		a = s.nextInt();
		System.out.print("Unesite b: ");
		b = s.nextInt();
		System.out.print("Unesite operator: ");
		operator = s.next();
		
		if (operator.equals("+")) {
			rezultat = a + b;
			System.out.println("Rezultat: " + rezultat);
		}
		else if (operator.equals("-")) {
			rezultat = a - b;
			System.out.println("Rezultat: " + rezultat);
		}
		else if (operator.equals("*")) {
			rezultat = a * b;
			System.out.println("Rezultat: " + rezultat);
		}
		else if (operator.equals("/")) {
			rezultat = a / b;
			System.out.println("Rezultat: " + rezultat);
		}
		else {
			System.out.println("Operator nije validan!");
		}
		
		
	}

}
