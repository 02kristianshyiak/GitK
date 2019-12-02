package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner user_input = new Scanner(System.in);

	String first_name;
	System.out.print("What is your first name? ");
	first_name = user_input.next();

	String last_name;
	System.out.print("What is your last name? ");
	last_name = user_input.next();

	String family_name;
	System.out.print("What coffee do you want?(mocha, macchiato, decaf, latte, frappe, americano, cappuccino, or black) ");
	family_name = user_input.next();

	String cream;
	System.out.print("Would you like cream? ");
	cream =  user_input.next();

	String size;     
	System.out.print("What size do you want? (Large, Medium, Small) ");
	size = user_input.next();

	String shots;
	System.out.print("How many shots of expresso do you want? ");
	shots = user_input.next();



	System.out.println("Hello " + first_name + " " + last_name + " we have your " + size + " "+ family_name + " with " + shots + " shots of expresso and you replied " + cream + " for cream so here you are. Have a great day!");
    }
}
