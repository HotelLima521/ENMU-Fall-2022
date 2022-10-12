import java.util.Scanner;
public class simpleCalculator {
   public static void main(String[] args){
      /*
       * Author: Derek White
       * Date: 6 Oct 2022
       * This program is just a simple calculator, from user input
       */
      Scanner userInput = new Scanner(System.in);
      double numberOne;
      double numberTwo;
      char operator;
      String prompt = "The product of the two numbers is: ";
      System.out.println("Enter first number: ");
      numberOne = userInput.nextDouble();
      System.out.println("Enter second number: ");
      numberTwo = userInput.nextDouble();
      System.out.println("Enter operator choice\n '/ = division, * = multiplication, + = addition, - = subtraction, % = modulus': ");
      operator = userInput.next().charAt(0);
      if(operator == '/'){
	 System.out.println(prompt + (numberOne / numberTwo));
      }
      else if(operator == '*'){
	 System.out.println(prompt + (numberOne * numberTwo));
      }
      else if(operator == '+'){
	 System.out.println(prompt + (numberOne + numberTwo));
      }
      else if(operator == '-'){
	 System.out.println(prompt + (numberOne - numberTwo));
      }
      else if(operator == '%'){
	 System.out.println(prompt + (numberOne % numberTwo));
      }
      else{
	 System.out.println("Incorrect input for prompt.");
      }
   }
}      
