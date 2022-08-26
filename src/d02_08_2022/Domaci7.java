package d02_08_2022;

import java.util.Scanner;

public class Domaci7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite stranicu trougla: ");
		double a = s.nextDouble();
		double b = 1.73;
		double p = a * a * b / 4;
		double o = 3 * a;
		
		System.out.println("Povrsina je: " + p);
		System.out.println("Obim je: " + o);

	}

}
