package com.practice;

public class SwitchcaseDemo {

	public static void main(String[] args) {

		String day = "Monday";

		switch (day) {
		case "Monday":
			System.out.println("Its Monday today");
			//break;
		case "Friday":
			System.out.println("Its Firday today");
			break;
		case "Sunday":
			System.out.println("Its Sunday today");
			break;
		default:
			System.out.println("You have entered invalid day");
		}

		System.out.println("I came out of switch block now");
	}

}
