import java.util.Scanner;
public class Lab3a {
	/*
	 * I don't really think this needs too much documentation, the code itself
	 * with the properly named variables in this case should be sufficient to
	 * properly understand and maintain the source. If I added any further
	 * documentation, I believe it would cause this source to become too bulky
	 * to read and 100% unecessary.
	 */
	public static char calculate(int g){
		int inputGrade = g;
		if(inputGrade >= 90){
			return 'A';
		}
		else if(inputGrade >= 80){
			return 'B';
		}
		else if(inputGrade >= 70){
			return 'C';
		}
		else if(inputGrade >= 60){
			return 'D';
		}
		else{
			return 'F';
		}
	}
	public static void main(String[] args){
		Scanner userinput = new Scanner(System.in); //Initializing Java's goofy user input
		System.out.println("Please enter grade");
		int gradeIn = userinput.nextInt(10); // Enforcing base 10
		char gradeOut = calculate(gradeIn);
		System.out.println("The grade is: " + gradeOut + '.');
	}
}
