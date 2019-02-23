package module2;

import java.util.*;

public class OddsAndEvens {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Let's play a game called \"Odds and Evens\".");
		System.out.print("What is your name? ");
		String name = input.next();
		System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
		String choose = input.next();

		if((choose.equals("o")) || (choose.equals("O"))) {
			System.out.println(name + " had picked odds! The computer will be evens. ");
		} else if((  (choose.equals("e"))) || (choose.equals("E"))) {
			System.out.println(name + " had picked evens! The computer will be odds. ");
		} else {
			System.out.println("Error! Please try again. ");
		}
		System.out.println("----------------------------------");
		System.out.println(" ");
		System.out.print("How many \"fingers\" do you put out? ");
		int fingers = input.nextInt();
		Random rand = new Random();
		int computer = rand.nextInt(6);
		System.out.println("The computer plays " + computer  + " \"fingers\".");
		System.out.println("----------------------------------");
		System.out.println(" ");

		int sum = fingers + computer;
		 

		System.out.println(fingers + " + " +computer+ " = " + sum);
		 boolean oddoreven = sum % 2 == 0;
		 if(oddoreven) {
			 System.out.println(sum + " is ...even " );
		 } else {
			 System.out.println(sum + " is ...odd ");
		 }
		 if(oddoreven) {
			 if((choose.equals("e")) || (choose.equals("E"))) {
				 System.out.println("That means " + name + " wins!:)");
			 } else {
				 System.out.println("That means computer wins!:)");
			 }
		 }
			 if(!oddoreven) {
				 if((choose.equals("o")) || (choose.equals("O"))) {
					 System.out.println("That means " + name + " wins!:)");
				 } else {
					 System.out.println("That means computer wins!:)");
				 }
			System.out.println("-------------------------------");
			 }
		 input.close();
		 }
	}
		
		
	


	
	
