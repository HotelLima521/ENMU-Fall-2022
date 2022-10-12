import java.util.Scanner;
public class moneyBagDrawPossibility {
   public static void main(String[] args){
      Scanner userInput = new Scanner(System.in);
      /*
       * Author: Derek White
       * Date: Oct 6 2022
       * The purpose of this program is to recieve input
       * for different bills, and then print out the expected
       * average draw
       */
      int bills1Dollar;
      int bills5Dollar;
      int bills10Dollar;
      System.out.println("Enter amount of $1 bills: ");
      bills1Dollar = userInput.nextInt();
      System.out.println("Enter amount of $5 bills: ");
      bills5Dollar = userInput.nextInt();
      System.out.println("Enter amount of $10 bills: ");
      bills10Dollar = userInput.nextInt();
      double billsTotal = bills1Dollar + bills5Dollar + bills10Dollar;
      double totalMoney = (bills1Dollar * 1) + (bills5Dollar * 5) + (bills10Dollar * 10);
      double result = totalMoney / billsTotal;
      System.out.println("The expected value of the draw = " + result);
   }
}
