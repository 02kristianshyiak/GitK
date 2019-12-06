package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String first_name;
	System.out.print("What is your name? ");
	first_name = sc.nextLine();

	System.out.println("Coffee Types: Cortado, Affogato, Doppio, Latte, Irish Coffee, Turkish Coffee (Start with a capital please)");

	String family_name;
	System.out.print("What coffee do you want? ");
	family_name = sc.nextLine();

	String size;
	System.out.print("What size do you want? (Large, Medium, Small): ");
	size = sc.nextLine();

	String shots;
	System.out.print("How many shots of espresso do you want?(Up to five shots) ");
	shots = sc.nextLine();

	System.out.println("Hello " + first_name + " we have your " + size + " "+ family_name + " with " + shots + " shots of espresso.");

	double original_price = 0;

	if(family_name.equals("Cortado")){
		original_price = 3.99;
		System.out.println("That'll be " + original_price);
	}

	if(family_name.equals("Affogato")) {
		original_price = 4.75;
		System.out.println("That'll be " + original_price);
	}

	if(family_name.equals("Doppio")) {
		original_price = 3.25;
		System.out.println("That'll be " + original_price);
	}

		if(family_name.equals("Latte")) {
			original_price = 2.95;
			System.out.println("That'll be " + original_price);
		}

		if(family_name.equals("Irish Coffee")) {
			original_price = 6.99;
			System.out.println("That'll be " + original_price);
		}

		if(family_name.equals("Turkish Coffee")) {
			original_price = 2.89;
			System.out.println("That'll be " + original_price);
		}

		if(shots.equals("1")) {
		System.out.println("plus 1.20 for a shot of espresso");
		original_price = original_price + 1.20;
	}

		if(shots.equals("2")) {
			System.out.println("plus 2.40 for the shots of espresso");
			original_price = original_price + 2.40;
		}

		if(shots.equals("3")) {
			System.out.println("plus 3.60 for the shots of espresso");
			original_price = original_price + 3.60;
		}

		if(shots.equals("4")) {
			System.out.println("plus 4.80 for the shots of espresso");
			original_price = original_price + 4.80;
		}

		if(shots.equals("5")) {
			System.out.println("plus 6.00 for the shots of espresso");
			original_price = original_price + 6.00;
		}

	System.out.println("$" + original_price);
    }
}

