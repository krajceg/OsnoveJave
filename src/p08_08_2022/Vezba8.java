package p08_08_2022;

import java.util.Scanner;

public class Vezba8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n;
//		int brojac1 = 0;
//		int brojac2 = 0;
//		int brojac3 = 0;
//		int brojac4 = 0;
		
		boolean isValid1 = false;
		boolean isValid2 = false;
		boolean isValid3 = false;
		boolean isValid4 = false;

		do {
			System.out.print("Unesi broj: ");
			n = s.nextInt();
			if (n == 1) {
//				brojac1++;
				isValid1 = true;
			}
			if (n == 2) {
//				brojac2++;
				isValid2 = true;
			}
			if (n == 3) {
//				brojac3++;
				isValid3 = true;
			}
			if (n == 4) {
//				brojac4++;
				isValid4 = true;
			}
//		} while (brojac1 == 0 || brojac2 == 0 || brojac3 == 0 || brojac4 == 0);
		} while (isValid1 == false || isValid2 == false || isValid3 == false || isValid4 == false);
		System.out.println("Kraj programa");
		System.out.println("Uneto je bar po jedan broj od brojeva: 1, 2, 3 i 4");
	}

}
