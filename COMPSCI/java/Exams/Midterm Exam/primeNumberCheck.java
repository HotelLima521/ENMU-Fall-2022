import java.util.Scanner;
public class primeNumberCheck {
   public static void main(String[] args){
      /*
       * Author: Derek White
       * Date: 6 Oct 2022
       * The purpose of this program is to recieve a number from a user
       * and return whether it is a prime number or not.
       */
      Scanner userInput = new Scanner(System.in);
      int usersNumber;
      int i = 2;
      int flag = 1;
      System.out.println("Please enter a number to check and see if it is a prime number: ");
      usersNumber = userInput.nextInt();
      if(usersNumber <= 1){
	 System.out.println("Your number, " + usersNumber + " is not prime");
      }
      else if(i < (usersNumber / 2 + 1)){
	 if(usersNumber % i == 0){
	    flag = 0;
	 }
	 else {
	    i += 1;
	 }
      }
      if(flag == 0){
	 System.out.println("Your number, " + usersNumber + " is not prime number.");
      }
      else{
	 System.out.println("Your number, " + usersNumber + " is a prime number.");
      }
   }
}
