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
       /**    
       * Function for separating outputs from other functions, blame my ADHD    
       */    
      char bar = '\u2015';    
      for(int position = 0; position < 50; position++){    
         System.out.print(colors('g') + bar + colors('r'));    
      }    
   }
   public static String colors(char input){
      /**
       * Function for applying color in terminal to make output easier to read
       * At the cost of a bit more annoying code in the strings.
       * 
       * @param input | This will be a character that will tell this function what to return
       *
       * @return color | This is a string that will put itself in another string to color the text.
       */
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
      /**
       * Finding middle digit
       * @param charArray is an array of characters split up from initial string
       * by user.
       *
       * @return middle | the middle character(s)
       */
<<<<<<< HEAD
      String middle = "";
      if (charArray.length % 2 == 0){
	 middle = (Integer.toString(charArray.length/2));
      }
      else{
	 middle = (Integer.toString(charArray[(charArray.length/2)-1])) + (Integer.toString(charArray[charArray.length/2]));
=======
      float middleDigits = (charArray.length) / 2;
      int[] intArray;
      intArray = new int[2];
      String middle = "";
      if (middleDigits % 2 == 0){
	 intArray[0] = Math.round(middleDigits);
      }
      else{
	 intArray[1] = Math.round(middleDigits);
	 intArray[0] = Math.round(middleDigits)-1;
>>>>>>> 813ffa69b4e3b7803bc52e1a7202727dcd480437
      }
      middle = Character.toString(charArray[userStringInput.charAt(intArray[0]])) + Character.toString(charArray[userStringInput.charAt(intArray[1]]));
      return middle;
   }
   public static String repeat(String userInput, int amount){
      /**
       * Repeats string x amount of times
       * @param userInput is the second string from user
       * @param amount is the amount to repeat
       *
       * @return output | is String by the amount requested by user
       */
      String output = "";
      for(int i = 0; i < amount; i++){
	 output += userInput;
      }
      return output;
   }
   public static int countVowels(char[] charArray){
      /**
       * Counting vowels in String
       * @param charArray is an array of characters split from the initial string
       * by the user.
       * @return vowels | to show amount of vowels in the string.
       */
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
      /**
       * Counting words in String
       * @param userStringInput is the initial, unaltered string from user.
       * 
       * @return words | To show the amount of words in the string.
       */
      int words = userStringInput.split("\\s").length;
      return words;
   }
}
