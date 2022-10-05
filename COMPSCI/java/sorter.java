import java.util.Scanner;
public class sorter {
   public static void main(String[] args){
      int largest;
      int middle;
      int smallest;
      System.out.println("Please enter three numbers: ");
      Scanner userinput = new Scanner(System.in);
      int no0 = userinput.nextInt();
      int no1 = userinput.nextInt();
      int no2 = userinput.nextInt();
      // Largest

      if(no0 >= no1 && no0 >= no2){
	 largest = no0;
      }
      else if(no1 >= no0 && no1 >= no2){
	 largest = no1;
      }
      else{
	 largest = no2;
      }
      
      // Middle
      if(no0 >= no1 && no0 <= no2 || no0 >= no2 && no0 <= no2){
	 middle = no0;
      }
      else if(no1 >= no0 && no0 <= no2 || no1 >= no2 && no1 <= no0){
	 middle = no1;
      }
      else{
	 middle = no2;
      }

      // Lowest
      if(no0 <= no1 && no0 <= no2){
	 smallest = no0;
      }
      else if(no1 <= no0 && no1 <= no2){
	 smallest = no1;
      }
      else{
	 smallest = no2;
      }

      System.out.println("In descending order: " + largest + ' ' + middle + ' ' + smallest);
   }
}
