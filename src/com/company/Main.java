package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Welcome to Advanced Coffee System or ACS!");

	String first_name;
	System.out.print("What is your name? ");
	first_name = sc.nextLine();
	first_name = first_name.toUpperCase();

	System.out.println("Coffee Types: Cortado, Affogato, Doppio, Latte, Irish Coffee, Turkish Coffee, Caffe Americano, Cappuccino, Caffe Mocha, Iced Coffee, Espressino, Christmas Special: Eggnog");

	String coffee;
	System.out.print("What coffee do you want? ");
	coffee = sc.nextLine();

	String size;
	System.out.print("What size do you want? (Large, Medium, Small): ");
	size = sc.nextLine();

	String shots;
	System.out.print("How many shots of espresso do you want?(Up to five shots) ");
	shots = sc.nextLine();

	String cream;
	System.out.print("Would you like cream with that? ");
	cream = sc.nextLine();

	String cups;
	System.out.println("How many cups would you like? ");
	cups = sc.nextLine();

	System.out.println("Hello " + first_name + " we have your " + size + " " + coffee + " with " + shots + " shots of espresso and you said " + cream + " to cream and " + cups + " cups of coffee.");

	double Cups = String cups;
	double original_price = 0;
	double estimated_time = 0;
	double seconds = 0;

	if(coffee.equals("Cortado") || coffee.equals("cortado")){
		original_price = 3.99;
		estimated_time = 3;
		seconds = 15;
		System.out.println("That'll be " + original_price);
	}

	if(coffee.equals("Affogato") || coffee.equals("affogato")) {
		original_price = 4.75;
		estimated_time = 4;
		seconds = 45;
		System.out.println("That'll be " + original_price);
	}

	if(coffee.equals("Doppio") || coffee.equals("doppio")) {
		original_price = 3.25;
		estimated_time = 1;
		seconds = 25;
		System.out.println("That'll be " + original_price);
	}

		if(coffee.equals("Latte") || coffee.equals("latte")) {
			original_price = 2.95;
			estimated_time = 3;
			seconds = 20;
			System.out.println("That'll be " + original_price);
		}

		if(coffee.equals("Irish Coffee") || coffee.equals("irish coffee")) {
			original_price = 6.99;
			estimated_time = 5;
			seconds = 0;
			System.out.println("That'll be " + original_price);
		}

		if(coffee.equals("Turkish Coffee") || coffee.equals("turkish coffee")) {
			original_price = 2.89;
			estimated_time = 3;
			seconds = 30;
			System.out.println("That'll be " + original_price);
		}

		if(coffee.equals("Caffe Americano") || coffee.equals("caffe americano")) {
			original_price = 2.25;
			estimated_time = 6;
			seconds = 15;
			System.out.println("That'll be " + original_price);
		}

		if(coffee.equals("Cappuccino") || coffee.equals("cappuccino")) {
			original_price = 3.65;
			estimated_time = 9;
			seconds = 0;
			System.out.println("That'll be " + original_price);
		}

		if(coffee.equals("Caffe Mocha") || coffee.equals("caffe mocha")) {
			original_price = 4.15;
			estimated_time = 10;
			seconds = 0;
			System.out.println("That'll be " + original_price);
		}

		if(coffee.equals("Iced Coffee") || coffee.equals("iced coffee")) {
			original_price = 2.25;
			estimated_time = 3;
			seconds = 35;
			System.out.println("That'll be " + original_price);
		}

		if(coffee.equals("Espressino") || coffee.equals("espressino")) {
			original_price = 3.25;
			estimated_time = 3;
			seconds = 0;
			System.out.println("That'll be " + original_price);
		}

		if(coffee.equals("Eggnog") || coffee.equals("eggnog")) {
			original_price = 3.50;
			estimated_time = 14;
			seconds = 10;
			System.out.println("That'll be " + original_price);
		}

		if(size.equals("Large") || size.equals("large")){
			System.out.println("plus 2.09 for the size");
			original_price = original_price + 2.19;
		}

		if(size.equals("Medium") || size.equals("medium")){
			System.out.println("plus 1.89 for the size");
			original_price = original_price + 1.89;
		}

		if(size.equals("Small") || size.equals("small")){
			System.out.println("plus 1.59 for the size");
			original_price = original_price + 1.59;
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

		original_price = Math.round(original_price * 100.0)/100.0;
	System.out.println("Total Price: $" + original_price * Cups);
	System.out.println("It'll be ready in " + estimated_time + " minutes and " + seconds + " sceonds.");
	System.out.println("Have a great day and Merry Christmas to you.");
    }
}