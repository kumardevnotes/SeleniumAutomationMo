package com.p;

public class SwitchDemo {

	public static void main(String[] args) {

		String day = "Mondayy"; //int empSalary = 10000;

		switch (day) {
		case "Monday":
			System.out.println("its first working day of the week");
			break;
		case "Thursday":
			System.out.println("its 4th working day of the week");
			break;
		case "Friday":
			System.out.println("Weekend starts on this day");
			break;
		case "Saturday":
			System.out.println("Its holiday. And sunday is also a holiday");
			break;
		default:
			System.out.println("Please pass valid day");
			break;

		}
		
		System.out.println("I am out of switch block....");

	}

}
