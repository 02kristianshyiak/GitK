package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner user_input = new Scanner(System.in);

	String first_name;
	System.out.print("What is your name? ");
	first_name = user_input.next();

	String family_name;
	System.out.print("What coffee do you want? ");
	family_name = user_input.next();

	String size;
	System.out.print("What size do you want? (Large, Medium, Small) ");
	size = user_input.next();

	String shots;
	System.out.print("How many shots of expresso do you want? ");
	shots = user_input.next();

	String full_name;
	full_name = first_name + " " + family_name;

	System.out.println("You are " + full_name);
    }
}
