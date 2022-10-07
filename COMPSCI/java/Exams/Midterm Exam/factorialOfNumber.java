import java.util.Scanner;
public class factorialOfNumber {
   public static void main(String[] args){
      /* Author: Derek White
       * Date: Oct 6 2022
       * This program will find the factorial for a number
       */
      Scanner userInput = new Scanner(System.in);
      System.out.println("Please enter a number for the factorial: ");
      int userIn = userInput.nextInt();
      int userInOriginal = userIn;
      double factorial = 1;
      int factorialIncrement = 1;
      while(factorialIncrement <= userIn){
	 factorial *= factorialIncrement;
	 factorialIncrement++;
      }
      System.out.println("The factorial of " + userInOriginal + " = " + factorial);
   }
}
