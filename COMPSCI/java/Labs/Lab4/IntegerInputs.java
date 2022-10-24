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
   public static String colors(char input){
      final String ANSI_RESET="\033[0;0m";
      final String ANSI_CYAN="\033[0;36m";
      final String ANSI_PURPLE="\033[1;38m";
      final String DEBUGGING_YELLOW = "\033[1;33m" + "\033[41m";
      String color = ANSI_RESET;
      if(input == 'r'){
	 color = ANSI_RESET;
      }
      else if(input == 'c'){
	 color = ANSI_CYAN;
      }
      else if(input == 'p'){
	 color = ANSI_PURPLE;
      }
      else if(input == 'd'){
	 color = DEBUGGING_YELLOW;
      }
      return color;
   }
   public static void main(String[] args){
      Scanner userInput = new Scanner(System.in);
      System.out.println("Please enter some integer values: ");
      String userStringInput = userInput.nextLine();
      int[] integerArray;
      integerArray = new int[userStringInput.length()];
      for(int userIn = 0; userIn < integerArray.length; userIn++){
	       System.out.printf("In Character %c, Character to Integer %d, Character to String %s, String to Integer %d\n",
		     userStringInput.charAt(userIn), (int)(userStringInput.charAt(userIn)),
		     Character.toString(userStringInput.charAt(userIn)), Integer.parseInt(Character.toString(userStringInput.charAt(userIn))) );

	       integerArray[userIn] = Integer.parseInt(Character.toString(userStringInput.charAt(userIn)));
	    }
      /*try {
	 while(!userStringInput.isEmpty()){
	 
	    for(int userIn = 0; userIn < integerArray.length; userIn++){
	       integerArray[userIn] = Integer.parseInt(Character.toString(userStringInput.charAt(userIn)));
	    }
	    userStringInput = userInput.nextLine();
	    counter++;
	 }
      }
      catch(NumberFormatException e){
	 System.out.println("It appears you inputted the incorrect character");
      }
      */
      // Smallest and Largest Inputs
      smallestAndLargestInputs(integerArray, userStringInput.length());
     
      // Cumulative Number Addition
      cumulativeNumberAddition(integerArray, userStringInput.length());

      // Number of Odd and Even Inputs
      numberOfOddAndEvenInputs(integerArray, userStringInput.length());

      // Adjacent Duplicates
      adjacentDuplicates(integerArray, userStringInput.length());

   }
   public static void smallestAndLargestInputs(int[] parsed, int counter){
      int smallest = 9999;
      int largest = 0;
      int n = 0; // To signify the position of the array
      while(n < counter){
	 //System.out.println(colors('d') + n + ' ' + counter + colors('r'));
	 if(smallest >= parsed[n]){
	    smallest = parsed[n];
	 }
	 if(parsed[n] >= largest){
	    largest = parsed[n];
	 }
	 n++;
      }
      System.out.println(colors('p') + "Largest: " + colors('c') + largest + colors('r') + colors('p') +"\nSmallest: " + colors('c') + smallest +colors('r'));
   }

   public static void cumulativeNumberAddition(int[] parsed, int counter){
      int n = 0;
      int sum;
      while(n < counter){
   	 sum += parsed[n];
	 n++;
      }
      System.out.printf("The Cumulative Sum is: %d", sum);
   }

   public static void numberOfOddAndEvenInputs(int[] parsed, int counter){
      int even, odd;
      while(n < counter){
	 if(n % 2 == 0){
	    even++;
	 }
	 else{
	    odd++;
	 }
	 n++;
      }
      System.out.printf("Number of even numbers: %d\nNumber of Odd Numbers: %d", even, odd);
   }
   public static void adjacentDuplicates(int[] parsed, int counter){
      // Let's literally just check for duplicates and push them to a new array, then push that array as a string
      int n = 0;
      int[] duplicate = new int duplicate[parsed.length()];
      while(n < counter){
	 duplicate[n]
      }

   }

}
