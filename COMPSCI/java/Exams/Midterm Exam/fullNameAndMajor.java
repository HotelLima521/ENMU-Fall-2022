import java.util.Scanner;
public class fullNameAndMajor {
   public static void main(String[] args){
      /* Author: Derek White
       * Date: Oct 6 2022
       * This program will read the full name and major
       * from user, then print them
       */
      Scanner userInput = new Scanner(System.in);
      System.out.println("Please enter your full name: ");
      String usersName = userInput.nextLine();
      System.out.println("Please enter your major: ");
      String usersMajor = userInput.nextLine();
      System.out.println(usersName + " is taking " + usersMajor);
   }
}

