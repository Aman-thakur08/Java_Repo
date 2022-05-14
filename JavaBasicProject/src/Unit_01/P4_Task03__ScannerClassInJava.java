package Unit_01;

import java.util.Scanner;

/*
 * When User takes Input from the console
 * 
 * nextLine()		Read user input [to read String]
 * next()			Read next token from the input entered by the user
 * nextBoolean()	Reads a Boolean value from the user
 * nextByte()		Reads a Boolean value from the user
 * nextDouble()		Reads a Double value from the user
 * nextFloat()		Reads a float value from the user
 * nextInt()		Reads a Integer value from the user
 * nextLine()		Reads a String value from the user
 * nextLong()		Reads a Long value from the user
 * nextShort()		Reads a Short value from the user
 */
public class P4_Task03__ScannerClassInJava {

	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in); //Create a scanner object
		Scanner myObj2 = new Scanner(System.in);
		
		//Read the First-Token: (_space bar)
		String firstName = myObj1.next();
		System.out.println("Name is: "+ firstName+"\n");
		
		String name = myObj2.nextLine();
		String name2 = myObj2.nextLine();
		
		System.out.println("Name is: "+ name +"\n" );
		System.out.println("Nmae is: "+ name2 + "\n");

		boolean b = myObj2.nextBoolean();
		System.out.println(b + "\n");
		
		myObj1.close();
		myObj2.close();
	}

}
