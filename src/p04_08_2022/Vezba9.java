package p04_08_2022;

import java.util.Scanner;

public class Vezba9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String radnja;

		int def = 75;

		System.out.print("Sta zelite uraditi sa zvukom: ");
		radnja = s.next();

		if (radnja.equals("pojacaj") || radnja.equals("smanji") || radnja.equals("mute")) {
			if (radnja.equals("pojacaj")) {
				def = def + 10;
				if (def > 100) {
					def = 100;
				}
			} else if (radnja.equals("smanji")) {
				def = def - 10;
				if (def < 0) {
					def = 0;
				}
			} else {
				def = 0;
			}

			System.out.println("Jacina zvuka je " + 75 + ".");
			System.out.println("Unesite akciju: " + radnja);
			System.out.println("Nova jacina zvuka je " + def + ".");

		} else {
			System.out.println("Uneta radnja nije validna!");
		}
		System.out.println();
		System.out.print("Sta zelite uraditi sa zvukom: ");
		radnja = s.next();

		if (radnja.equals("pojacaj") || radnja.equals("smanji") || radnja.equals("mute")) {
			if (radnja.equals("pojacaj")) {
				def = def + 10;
				if (def > 100) {
					def = 100;
				}
			} else if (radnja.equals("smanji")) {
				def = def - 10;
				if (def < 0) {
					def = 0;
				}
			} else {
				def = 0;
			}

			System.out.println("Jacina zvuka je " + 75 + ".");
			System.out.println("Unesite akciju: " + radnja);
			System.out.println("Nova jacina zvuka je " + def + ".");

		} else {
			System.out.println("Uneta radnja nije validna!");
		}
		System.out.println();
		System.out.print("Sta zelite uraditi sa zvukom: ");
		radnja = s.next();

		if (radnja.equals("pojacaj") || radnja.equals("smanji") || radnja.equals("mute")) {
			if (radnja.equals("pojacaj")) {
				def = def + 10;
				if (def > 100) {
					def = 100;
				}
			} else if (radnja.equals("smanji")) {
				def = def - 10;
				if (def < 0) {
					def = 0;
				}
			} else {
				def = 0;
			}

			System.out.println("Jacina zvuka je " + 75 + ".");
			System.out.println("Unesite akciju: " + radnja);
			System.out.println("Nova jacina zvuka je " + def + ".");

		} else {
			System.out.println("Uneta radnja nije validna!");
		}
		System.out.println();
		System.out.print("Sta zelite uraditi sa zvukom: ");
		radnja = s.next();

		if (radnja.equals("pojacaj") || radnja.equals("smanji") || radnja.equals("mute")) {
			if (radnja.equals("pojacaj")) {
				def = def + 10;
				if (def > 100) {
					def = 100;
				}
			} else if (radnja.equals("smanji")) {
				def = def - 10;
				if (def < 0) {
					def = 0;
				}
			} else {
				def = 0;
			}

			System.out.println("Jacina zvuka je " + 75 + ".");
			System.out.println("Unesite akciju: " + radnja);
			System.out.println("Nova jacina zvuka je " + def + ".");

		} else {
			System.out.println("Uneta radnja nije validna!");
		}
		System.out.println();
		System.out.print("Sta zelite uraditi sa zvukom: ");
		radnja = s.next();

		if (radnja.equals("pojacaj") || radnja.equals("smanji") || radnja.equals("mute")) {
			if (radnja.equals("pojacaj")) {
				def = def + 10;
				if (def > 100) {
					def = 100;
				}
			} else if (radnja.equals("smanji")) {
				def = def - 10;
				if (def < 0) {
					def = 0;
				}
			} else {
				def = 0;
			}

			System.out.println("Jacina zvuka je " + 75 + ".");
			System.out.println("Unesite akciju: " + radnja);
			System.out.println("Nova jacina zvuka je " + def + ".");

		} else {
			System.out.println("Uneta radnja nije validna!");
		}

	}

}
