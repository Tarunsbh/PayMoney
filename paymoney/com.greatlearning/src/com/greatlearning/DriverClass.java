package com.greatlearning;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		int n, transaction[], target, sum = 0;
		int i;
		boolean flag = false;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Size of transaction array: ");
			n = sc.nextInt();
			transaction = new int[n];
			System.out.println("Enter transaction values: ");
			for (i = 0; i < n; i++) {
				transaction[i] = sc.nextInt();
			}
			System.out.println("Enter target values: ");
			target = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			sum += transaction[i];
			if (sum >= target) {
				flag = true;
				break;
			}
		}
		if (flag == true)
			System.out.println("Target achieved after " + (i + 1) + " transactions.");
		else
			System.out.println("Target not achieved");

	}

}
