import java.util.Scanner;
/*
 * Author: Derek White
 * Date: 25 October 2022
 *
 * The purpose of this program is to take a string input
 * from the user and then do the following:
 *
 * 1. Return a string with the middle character if the string is odd,
 * or the two middle chars if the string is even.
 *
 * 2. Make a string repeat a certain amount of times
 *
 * 3. Count the vowels in a string
 *
 * 4. Count fall words (lower case words)
 */
public class stringFunctions{
   public static void bar(){
       /*    
       * Function for separating outputs from other functions, blame my ADHD    
       */    
      char bar = '\u2015';    
      for(int position = 0; position < 50; position++){    
         System.out.print(colors('g') + bar + colors('r'));    
      }    
   }
   public static String colors(char input){
      final String ANSI_RESET="\033[0;0m";
      final String ANSI_CYAN="\033[0;36m";
      final String ANSI_PURPLE="\033[1;38m";
      final String ANSI_GREEN="\033[0;32m";
      final String DEBUGGING_YELLOW="\033[1;33m" + "\033[41m";
      String color = ANSI_RESET;
      if(input == 'c'){
	 color = ANSI_CYAN;
      }
      else if(input == 'p'){
	 color = ANSI_PURPLE;
      }
      else if(input == 'g'){
	 color = ANSI_GREEN;
      }
      else if(input == 'D'){
	 color = DEBUGGING_YELLOW;
      }
      return color;
   }
   public static void main(String[] args){
      Scanner userInput = new Scanner(System.in);
      System.out.println(colors('g') + "Enter a string: " + colors('r'));
      String userStringInput = userInput.nextLine();
      char[] charArray;
      charArray = new char[userStringInput.length()];
      for(int arrayPos = 0; arrayPos < charArray.length; arrayPos++){
	 charArray[arrayPos] = userStringInput.charAt(arrayPos);
      }
      // Calling methods below
      // Finding Middle Char
      System.out.printf(colors('p') + "The middle character is: " + colors('c') + "%c" +  colors('r') + "\n", middle(charArray));
      bar();
      // String Repeat
      System.out.printf(colors('g') + "Enter a string to repeat.\n" + colors('c') + "-> " + colors('r'));
      String repeatStr = userInput.nextLine();
      System.out.printf(colors('g') + "Enter an amount of times to repeat this string." + colors('c') + "\n-> " + colors('r'));
      int repeatNo = userInput.nextInt();
      System.out.printf(colors('c') + "\n%s\n" + colors('r'), repeat(repeatStr, repeatNo));
      bar();
      // Counting Vowels
      System.out.printf(colors('p') + "\nThe amount of vowels in the original string is: " + colors('c') + "%d" + colors('r') + "\n", countVowels(charArray));
      bar();
      // Counting Words
      System.out.printf(colors('p') + "\nThe amount of words in the original string is: " + colors('c') + "%d" + colors('r') + "\n", countWords(userStringInput));
   }
   
   public static String middle(char[] charArray){
      // Finding middle digit
      float middleDigits = (charArray.length - 1) / 2;
      int middleInt = 0;
      int middleIntUpper = 0;
      String middle = "";
      if (middleDigits % 2 == 0){
	 middleInt = Math.round(middleDigits);
	 middle = Integer.toString(charArray[middleInt]);
      }
      else{
	 middleIntUpper = Math.round(middleDigits);
	 middleInt = middleIntUpper - 1;
	 middle = Integer.toString(charArray[middleInt]) + Integer.toString(charArray[middleIntUpper]);
      }
      return middle;
   }
   public static String repeat(String userInput, int amount){
      // repeating string x amount of times
      String output = "";
      for(int i = 0; i < amount; i++){
	 output += userInput;
      }
      return output;
   }
   public static int countVowels(char[] charArray){
      // Counting vowels in String
      int vowels = 0;
      char[] vowelArray;
      vowelArray = new char[]{'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
      for(int i = 0; i < charArray.length; i++){
	 for(int j = 0; j < 10; j++){
	    if(charArray[i] == vowelArray[j]){
	       vowels++;
	    }
	 }
      }
      return vowels;
   }
   public static int countWords(String userStringInput){
      // Counting words in String
      int words = userStringInput.split("\\s").length;
      return words;
   }
}
