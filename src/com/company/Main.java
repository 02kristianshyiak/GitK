package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String first_name;
	System.out.print("What is your name? ");
	first_name = sc.nextLine();
	first_name = first_name.toUpperCase();

	System.out.println("Coffee Types: Cortado, Affogato, Doppio, Latte, Irish Coffee, Turkish Coffee, Caffe Americano");

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

	if(family_name.equals("Cortado") || family_name.equals("cortado")){
		original_price = 3.99;
		System.out.println("That'll be " + original_price);
	}

	if(family_name.equals("Affogato") || family_name.equals("affogato")) {
		original_price = 4.75;
		System.out.println("That'll be " + original_price);
	}

	if(family_name.equals("Doppio") || family_name.equals("doppio")) {
		original_price = 3.25;
		System.out.println("That'll be " + original_price);
	}

		if(family_name.equals("Latte") || family_name.equals("latte")) {
			original_price = 2.95;
			System.out.println("That'll be " + original_price);
		}

		if(family_name.equals("Irish Coffee") || family_name.equals("irish coffee")) {
			original_price = 6.99;
			System.out.println("That'll be " + original_price);
		}

		if(family_name.equals("Turkish Coffee") || family_name.equals("turkish coffee")) {
			original_price = 2.89;
			System.out.println("That'll be " + original_price);
		}

		if(family_name.equals("Caffe Americano") || family_name.equals("caffe americano")) {
			original_price = 2.25;
			System.out.println("That'll be " + original_price);
		}

		if(size.equals("Large") || size.equals("large")){
			System.out.println("plus 4.50 for the size");
			original_price = original_price + 4.50;
		}

		if(size.equals("Medium") || size.equals("medium")){
			System.out.println("plus 4.25 for the size");
			original_price = original_price + 4.25;
		}

		if(size.equals("Small") || size.equals("small")){
			System.out.println("plus 4.00 for the size");
			original_price = original_price + 4.00;
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

