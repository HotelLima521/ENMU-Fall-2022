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
public class IntegerInputs extends ArrayList {
   public static void main(String[] args){
      Scanner userInput = new Scanner(System.in);
      System.out.println("Please enter some integer values: ");
      String userStringInput = userInput.nextLine();
      ArrayList input[] = new ArrayList.inputArray[20];
      ArrayList parse[] = new ArrayList.integerArray[20];
      try {
	 while(!userStringInput.isEmpty()){
	 
	    for(int userIn = 0; userIn < parse.length; userIn++){
	       int userNumber = Integer.parseInt(userStringInput);
	       parse[userIn] = userNumber;  
	    }
	    userStringInput = userInput.nextLine();
	 }
      }
      catch(NumberFormatException e){
	 System.out.println("It appears you inputted the incorrect character");
      }
      // Smallest and Largest Inputs
      smallestAndLargestInputs();
     
      // Cumulative Number Addition
 //     cumulativeNumberAddition(biggest, smallest);

      // Number of Odd and Even Inputs
 //     numberOfOddAndEvenInputs();

      // Adjacent Duplicates
 //     adjacentDuplicates();

   }
   public static void smallestAndLargestInputs(){
      ArrayList parsed[] = new ArrayList.integerArray[20];
      int smallest;
      int largest;
      int n = 0; // To signify the position of the array
      while(parsed[n] < parsed.length){
	 if(n < n+1){
	    smallest = n;
	 }
	 else{
	    largest = n;
	 }
      }
      System.out.println("Largest: " + largest +"\nSmallest: " + smallest);
   }

   /*public static void cumulativeNumberAddition(){
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

   public static void numberOfOddAndEvenInputs(){
   
      
   public static void adjacentDuplicates(){
   }*/

}
