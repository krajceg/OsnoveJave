package Vezbe;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Osnovi {

	public static void main(String[] args) {
		
//		SCANNER
//		Scanner s = new Scanner(System.in);
//		----------------------------
//		
//		RANDOM
//		Random gen = new Random();
//		int a = gen.nextInt(brojevi.size());
//		----------------------------
//		
//		ARRAYLIST
//		ArrayList<Integer/Double/String> name = new ArrayList<Integer/Double/String>();
//		name.add/set/get/size - just some of options
//		----------------------------
//		
//		VARIABLES
//		
//		int x;        - whole numbers
//		double y;	  - decimals
//		String name;  - text
//		boolean		  - true or false
//		float         - decimals, we don't use it often
//		char		  - single character, we don't use it often
//		
//		System.out.println(); + System.out.print();
//		x = s.nextInt();
//		y = s.nextDouble();
//		name = s.next(); s.nextLine();
//		----------------------------
//		
//		&& = AND
//		|| = OR
//		----------------------------
//		
//		IF ELSE
//	
//		if (condition) {
//			block of code to be executed if the condition is true
//		}
//		else if {
//			block of code to be executed if the condition is true
//		}
//		else {
//			block of code to be executed, if the same condition is false
//		}
//		-----------------------------
//		
//		FOR
//		
//		for (statement 1; statement 2; statement 3) {block of code to be executed}
//		
//		Statement 1 is executed (one time) before the execution of the code block.
//
//		Statement 2 defines the condition for executing the code block.
//
//		Statement 3 is executed (every time) after the code block has been executed.
//		
//		Example:
//		for (int i = x; i < y; i++) {
//			code block to be executed
//		}
//		-----------------------------
//		
//		CONVERTING
//		INT TO DOUBLE
//		
//		int myInt = 9;
//		double myDouble = myInt;		// First way - Easy and user friendly
//		
//		System.out.println(myInt);      // Output 9
//	    System.out.println(myDouble);   // Output 9.0
//		
//		double myDouble = Double.valueOf(myInt);		// Second way
//		-----------------------------
//		
//		CONVERTING
//		INT TO STRING
//		
//		int myInt = 9;
//		String myString = myInt + "";	// First way - Easy and user friendly
//		
//		System.out.println(myInt);      // Output 9
//	    System.out.println(myString);   // Output 9
//
//		String myString = String.valueOf(myInt);		// Second way
//		String myString = Integer.toString(myInt);		// Third way
//		String myString = String.format("%d", myInt);	// Fourth way
//		-----------------------------
//		
//		CONVERTING
//		DOUBLE TO STRING
//		
//		double myDouble = 9.0;
//		String myString = myDouble + "";				// First way - Easy and user friendly	
//		String myString = String.valueOf(myDouble);		// Second way
//		String myString = Double.toString(myDouble);  	// Third way
//		
//		System.out.println(myDouble);	// Output 9.0
//		System.out.println(myString);	// Output 9.0
//		-----------------------------
//		
//		CONVERTING
//		DOUBLE TO INT
//		
//		double myDouble = 9.0;
//		int myInt = (int)myDouble;
//		
//		System.out.println(myInt);		// Output 9
//		System.out.println(myDouble);	// Output 9.0
//		-----------------------------
//		
//		CONVERTING
//		STRING TO INT
//		
//		String myString = "-25";
//		
//		int myInt = Integer.parseInt(myString);		// First way
//		
//		int myInt2 = Integer.valueOf(myString);		// Second way
//		
//		*This will only work in case when string contains only whole numbers
//		
//		*BONUS: In case string has characters other than numbers
//		
//		String myString = "-12FF34.5";
//		String myString2 = myString.replaceAll("[^0-9-]", "");	//.replaceAll("what to replace", "with")
//		We replaced every non-numeric characters with the empty string (excluding "-", for negative numbers)
//
//		IMPORTANT: This excludes "." so it can't be used for double (check print for myDouble)
//		
//		double myDouble = Double.valueOf(myString2);
//		int myInt = Integer.valueOf(myString2);
//		
//		System.out.println(myString);	// Output -12FF34.5
//		System.out.println(myString2);	// Output -12345
//		System.out.println(myDouble);	// Output -12345.0 - .0 is added at the end
//		System.out.println(myInt);		// Output -12345
//		-----------------------------
//		
//		CONVERTING
//		STRING TO DOUBLE
//		
//		String myString = "-12.3";	// This will only work in case when string contains only numbers
//		double myDouble = Double.valueOf(myString);			// First way
//		double myDouble2 = Double.parseDouble(myString);	// Second way
//		
//		System.out.println(myString);	// Output -12.3
//		System.out.println(myDouble);	// Output -12.3
//		
//		*BONUS: In case string has characters other than numbers
//		
//		String myString = " -12F F34.5";
//		String myString2 = myString.replaceAll("[^0-9-.]", "");
//		We replaced every non-numeric characters with the empty string (excluding "-" and ".")
//		
//		double myDouble = Double.valueOf(myString2);
//		
//		System.out.println(myString);	// Output  -12F F34.5
//		System.out.println(myString2);	// Output -1234.5
//		System.out.println(myDouble);	// Output -1234.5
//		-----------------------------
//		
//		BONUS
//		
//		String myString = "         New    York  ";
//		String myString2 = myString.trim();
//	
//		System.out.println(myString);	// Output          New    York  
//		System.out.println(myString2);	// Output	New    York
//		Trim removes spaces at the start the string and at the end, however it won't remove spaces 
//		between words!
//		
//		BONUS BONUS :D
//		
//		String myString2 = myString.replaceAll("( )+", " "); // Pair it with trim if needed
//		This will replace all spaces with a single space, including ones at the start and at the end!
//		String myString3 = myString2.trim();
//		
//		System.out.println(myString);	// Output "         New    York  "
//		System.out.println(myString2);	// Output " New York "
//		System.out.println(myString3);	// Output "New York"
//
//		BONUS BONUS BONUS XD
//		
//		String myString = "..-.-.-.-.--ff...123---...45....--.-.-.-.-.-.-.-.-.----....---....-.-.-.-.-.";
//		String myString2 = myString.replaceAll("[^0-9-.]", "");	// This will leave numbers, "-" and "."
//		String myString3 = myString2.replaceAll("\\.+", ".");	// This will remove all excessive "."
//		String myString4 = myString3.replaceAll("-+", "-");		// This will remove all excessive "-"
//		String myString5 = myString4.replaceAll("\\.+$", "");	// This will remove "." at the end
//		String myString6;
//		int a;		// We will use a to represent index of "-" so we can compare it with index of first digit
//		int b = -1;	// that way we can determine if the number should be negative
//
//		a = myString5.indexOf("-");	// This will find indexOf "-", we will need it later
//		for (int i = 0; i < myString5.length(); i++) {	// This will find indexOf first number
//			if (Character.isDigit(myString5.charAt(i))) {	// Maybe there is an other way, no clue :D
//				b = i;
//				break;	// Important
//			}
//		}
//		System.out.println(myString5);	// Output .-.-.-.-.-.123-.45.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-
//		System.out.println(a);			// Output 1 (index starts from 0)
//		System.out.println(b);			// Output 11 (based on myString5)
//		if (myString5.trim().startsWith("-")) {	// If it starts with "-" 
//			myString6 = myString5.replaceAll("-", ""); // it will remove all of them
//			if (myString6.trim().startsWith(".")) {	// If the new one starts with "." 
//				myString6 = myString6.substring(1);	// it will remove it
//			}
//			myString6 = "-" + myString6; // If it started with "-" it will add it back
//		}
//		else {
//			myString6 = myString5.replaceAll("-", ""); // If it doesn't start with "-" it will remove all "-"
//		}
//		for (int i = 0; i < myString.length(); i++) { // Maybe it can be reduced but I'm not sure :)
//			if (myString6.trim().startsWith(".")) { // If it starts with "."
//			myString6 = myString6.substring(1);	// it will remove it
//		}
//			else if (myString6.trim().endsWith("-") || myString6.trim().endsWith(".")) {
//				// If it ends with "-" or "." it will remove it
//				myString6 = myString6.substring(0, myString6.length() - 1);
//			}
//
//		}
//		if (a<b) {	// If indexOf ("-") < indexOf(first digit) it means that number was negative
//			myString6 = "-" + myString6;
//		}
//		double myDouble = Double.valueOf(myString6);
//		
//		System.out.println(myString);	// Output ..-.-.-.-.--ff...123---...45....--.-.-.-.-.-.-.-.-.----....---....-.-.-.-.-.
//		System.out.println(myString2);	// Output ..-.-.-.-.--...123---...45....--.-.-.-.-.-.-.-.-.----....---....-.-.-.-.-.
//		System.out.println(myString3);	// Output .-.-.-.-.--.123---.45.--.-.-.-.-.-.-.-.-.----.---.-.-.-.-.-.
//		System.out.println(myString4);	// Output .-.-.-.-.-.123-.45.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
//		System.out.println(myString5);	// Output .-.-.-.-.-.123-.45.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-
//		System.out.println(myString6);	// Output -123.45
//		System.out.println();
//		System.out.println(myDouble);	// Output -123.45
//		-----------------------------
//		
//		DO WHILE
//		
//		do {
//			  // code block to be executed
//			}
//			while (condition);
//		-----------------------------
//		
//		SWITCH
//		
//		switch(expression) {
//		  case x:
//		    // code block
//		    break;
//		  case y:
//		    // code block
//		    break;
//		  default:
//		    // code block
//		}
//		-----------------------------

		
	}

}
