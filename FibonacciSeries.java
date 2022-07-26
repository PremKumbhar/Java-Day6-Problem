package com.bridgelabz.LogicalProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10, firstTerm = 1, secondTerm = 2;
		System.out.println("Fabonacci Series till " + n + " terms:");
		for (int i = 1; i <= n; i++)
		{
			System.out.println(firstTerm + " ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
		}
	}

}
