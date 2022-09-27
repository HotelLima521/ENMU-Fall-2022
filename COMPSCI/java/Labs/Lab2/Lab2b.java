import java.util.Scanner;
public class Lab2b {
		public static void compute(int t1, int t2){
		int hours = 0;
		int minutes = 0;
		int time = 0;
		int time1 = t1;
		int time2 = t2;
			if(time1 < time2){
				time = time2 - time1;
			}
			else if(time1 > time2){
				time = (time2-(time1-1200))+1200;
			}
		hours = time/100;
		minutes = time%100;
		System.out.println("The time difference is " + hours + " hours, and " + minutes + " minutes.");
		}
	public static void main(String[] args){
		Scanner userinput = new Scanner(System.in); // Setting up user input due to goofy Java Syntax
		System.out.println("Please enter first time in 24-hour format\n-> ");
		int time1 = userinput.nextInt(10); // Enforcing base 10, not really necessary to do this, but it's good practice
		System.out.println("Please enter second time in 24-hour format\n-> ");
		int time2 = userinput.nextInt(10); // Enforcing base 10, not really necessary to do this, but it's good practice.
		compute(time1, time2);

	}
}
