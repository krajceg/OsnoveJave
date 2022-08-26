package p09_08_2022;

import java.util.ArrayList;

public class Predavanje1 {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
//		System.out.println(cars.size());
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
//	    System.out.println(cars.size());
//	    System.out.println(cars.get(0));
	    
	    String x = cars.get(0) + "!";
//	    cars.add(0, x);
//	    cars.remove(1);
	    cars.set(0,"test");
	    System.out.println(cars);
	    cars.indexOf("Mazda");
	    System.out.println(cars.indexOf("Mazda"));

	}

}
