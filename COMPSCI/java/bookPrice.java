import java.util.Scanner;

public class bookPrice {

   public static void main(String[] args){

      Scanner userInput = new Scanner(System.in);

      System.out.println("Enter total book price, followed by number of books: ");
      double bookPrice = userInput.nextDouble();
      int numberOfBooks = userInput.nextInt();
      double tax = 0.075; // 7.5%
      double shippingCost = 2.00;
      bookPrice += (bookPrice * tax);
      double sum = (bookPrice * numberOfBooks)+(numberOfBooks * shippingCost);
      System.out.println("The sum of the order is: " + sum);
   }
}
