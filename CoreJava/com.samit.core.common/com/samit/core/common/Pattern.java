package com.samit.core.common;

import java.util.Scanner;

public class Pattern {
	
	 public static void main(String[] args) {

		    System.out
		        .println("Welcome to Java program to print pyramid patterns of stars and numbers");
		    Scanner scnr = new Scanner(System.in);

		    System.out.println("Please enter number of rows for pyramid pattern");
		    int rows = scnr.nextInt();

		    System.out.println("Printing Pyramid pattern of stars");
		    printPyramidPattern(rows, true);

		    System.out.println("Printing Pyramid pattern of numbers");
		    printPyramidPattern(rows, false);

		    scnr.close();

		  }

	 /**
	   * Java method to print pyramid pattern of stars for given number of rows. Key
	   * here is to remember that you need to use two loops and first loop should
	   * start with 1 instead of 0. If you start the first loop also with zero than
	   * the first line will be empty as nothing will be printed there. The first
	   * loop is responsible for printing number of rows and second, the inner loop
	   * is there to print the corresponding number of stars in each row.
	   * 
	   * @param rows
	   */
	  public static void printPyramidPattern(int rows, boolean isStarPattern) {

	    // outer loop to print number of rows
	    for (int i = 1; i <= rows; i++) {

	      // inner loop to print stars in individual rows
	      for (int j = 1; j <= i; j++) {

	        if (isStarPattern) {
	          System.out.print("*");
	        } else {
	          System.out.print(j);
	        }
	      }
	      System.out.println();
	    }
	  }

		
}
