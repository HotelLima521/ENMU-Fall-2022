import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
class Quiz7 {
   public static void main(String[] args){
      try {
	 int lineNumber = 0;
	 File quizFile = new File("hello.txt");
	 if(quizFile.createNewFile()){
	    System.out.println("Created File: " + quizFile.getName());
	 }
	 else {
	    System.out.println("This file already exists: " + quizFile.getName());
	 }
	 Scanner line = new Scanner(quizFile);
	 while(line.hasNextLine()){
	    line.nextLine();
	    lineNumber++;
	 }
	 System.out.printf("Line count: %d\n", lineNumber);
	 line.close();
	 FileWriter writeToFile = new FileWriter("hello.txt");
	 writeToFile.write("Hello, World!");
	 writeToFile.close();
	 System.out.print("Write complete");
	 for(int i = 0; i < 3; i++){
	    Thread.sleep(350);
	    System.out.print('.');
	 }
	 System.out.println();
	 Scanner readFile = new Scanner(quizFile);
	 System.out.println("Reading from file: " + quizFile.getName());
	 System.out.println(readFile.nextLine());
      }
      catch(Exception e){
	 e.getStackTrace();
      }
   }
}
