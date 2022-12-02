package com.practice;

public class WhileDoWhileDemo {

	public static void main(String[] args) {
		
		int sum =0;
		while(sum <= 10) { // 11 <= 10 --> true
			System.out.println(sum); // 0 1 2...10
			sum = sum+1; // 1+1 = 2
			//sum ==11
		}
		
		sum =0;
		do {
			System.out.println(sum);
			sum = sum+1;
		} while(sum <= 10);

	}

}
