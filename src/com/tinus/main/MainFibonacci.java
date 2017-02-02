package com.tinus.main;

import java.util.Scanner;

public class MainFibonacci {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah bilangan fibonacci yang dinginkan: ");
		int x = input.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println(fibonacciNumbers(i));
		}
	}

	private static int fibonacciNumbers(int x) {
		if (x == 1 || x <= 0) {
			return x;
		} else {
			return fibonacciNumbers(x - 1) + fibonacciNumbers(x - 2);
		}
	}
}
