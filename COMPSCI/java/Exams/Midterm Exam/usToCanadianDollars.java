import java.util.Scanner;
public class usToCanadianDollars {
   public static void main(String[] args){
      /*
       * Author: Derek White
       * Date: 6 Oct 2022
       * The purpose of this program is to convert
       * US currency to Canadian Currency
       */
      // Current exchange rate is 1.37 ($1 USD = $1.37CAD)
      Scanner userInput = new Scanner(System.in);
      // Dr. Imhed, I will be using doubles as the data type, because money should ALWAYS be treated as a double float.
      double exchangeRate = 1.37;
      double usDollars;
      double usDollarsOriginal;
      double caDollars;
      System.out.println("Please enter amount in US Dollars to convert to Canadian Dollars: ");
      usDollars = userInput.nextDouble();
      usDollarsOriginal = usDollars;
      System.out.println(usDollars);
      caDollars = usDollars + (usDollars * exchangeRate); // Adding the sum of US Dollars multiplied by exchange rate
				     			   // to the original amount of US Dollars
	       
      System.out.println("$" + usDollarsOriginal + " US Dollars = $" + caDollars + " Canadian Dollars.");
   }
}
