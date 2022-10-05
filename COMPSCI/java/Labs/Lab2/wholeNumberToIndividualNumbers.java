import java.util.Scanner;
public class wholeNumberToIndividualNumbers {
   /*
    * Author: Derek White
    * Date: 30 September 2022
    *
    * The purpose of this program is for the user to input a number, and then
    * the program will break it up into individual characters and print them
    * individually, instead of the original whole number.
    */
   public static void main(String[] args){
      Scanner userinput = new Scanner(System.in); //User input setup
      System.out.println("Please enter a whole number: ");
      int numberIn = userinput.nextInt(10); // Enforcing base 10 for user input
      numBreak(numberIn);
   }
   public static void numBreak(int userNumber){
      int i = 0;
      //int wholeNumberLength = length(Integer.toString(userNumber));
      //char[] numberBreak = new char[]{wholeNumberLength};
      String numberAsAString = Integer.toString(userNumber);
      for(i = 0; i < numberAsAString.length(); i++){
	 System.out.println(numberAsAString.charAt(i));
      }
      //while(numberBreak[i] < wholeNumberLength){
      // System.out.println(numberBreak[i]);
      // i++;
      //}
   }
}
