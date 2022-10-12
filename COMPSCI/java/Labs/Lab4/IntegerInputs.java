/*
 * Author: Derek White
 * Date: 10 October 2022
 *
 * Purpose: This program will recieve an integer input from the user as a string, split it into
 * individual characters, to then be compared and print out highest and lowest of the integer,
 * as well as duplicates of said integer (e.g. 1  5 5 6 6 9 9 will print out 1 5 6 9).
 *
 * It will also print out the cumulative numbers as a sum, e.g. 1 5 9 = 15, as well as the number
 * of even and odd numbers.
 */

import java.util.Scanner;
public class IntegerInputs {
   public static void main(String[] args){
      int biggest, smallest;
      Scanner userInput = new Scanner(System.in);
      System.out.println("Please enter some integer values: ");
      boolean flag = true;
      int intInput = userInput.nextInt();
      biggest = intInput;
      smallest = intInput;
           System.out.println("Smallest: " + smallest);
      System.out.println("Biggest: " + biggest);
      System.out.println("Numbers: " + individualNumbers);
   }
   public static int cumulativeNumberAddition(int number0, int number1){
      while(flag){
	 intInput = userInput.nextInt();
   	 if(biggest <= intInput){
	    biggest = intInput;
	 }
	 else if(smallest >= intInput){
	    smallest = intInput;
	 }

      }
   }













}
