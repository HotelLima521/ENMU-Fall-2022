import java.util.Scanner;
public class Lab2b {
	public static int base10to60(int x){
		int time = x;
		int[] q;
		int[] r;
		q[0] = time;
		int i = 0;
		while(q[i] > 0) {
			r[i] = q[i] % 60;
			q[i+1] = q[i] / 60;
			i+=1;
		}
		return time;
	}
	public static void counter(int a, int b){
		int hours = 0;
		int minutes = 0;
		int time1 = a;
		int time2 = b;
		int count;
		// Really need to convert from base 10 to base 60 here
		time1 = base10to60(time1);
		time2 = base10to60(time2);
		// Okay, conversion complete, now need to compare the numbers.
		count = time1;
		while(time1 != time2){
			while (time1 > time2){
				time1++;
				count++;
				if(time1 == base10to60(2400)){
					time1=0;
				}
			}
			int hours1 = count/60;
			int hours2 = time2/60;
			hours = hours2 - hours1;
			int minutes1 = count%60;
			int minutes2 = time2%60;
			minutes = minutes2 - minutes1;
			// Debugging purposes only
			System.out.println("The time difference is " + hours + " hour(s) and " + minutes + " minutes.");
			}
		//System.out.println("The time difference is " + hours + " hour(s) and " + minutes + " minutes.");
	}
	public static void compute(int a, int b){
		/*
		 * May have to split hours and minutes. E.g. 0100 will split into 01 and 00 so they can be worked on
		 * individually. Then will be combined as ints 0100 + 0000 later on
		 * 
		 * Additionally, convert to base 60, so it's easier to work with. e.g.:
		 * 1....59 ->
		 * 100...159 ->
		 * 200...259 ->
		 * 300
		 *
		 * OR just parse string input into two pieces and compare the two; should be easiest route.
		 */
		int time1 = a;
		int time2 = b;
		/* ############################################################
		 * ### May not have to have multiple if statements here tbh ###
		 * ############################################################
		 */
		if(time1 != time2){ // Time1 is earlier than Time2
			counter(time1, time2);			

		}
		//else if(time1 > time2){ // Time1 is later than Time2, must add additional hours and minutes to catch up since time2 is in the next day
		//	counter(time1, time2);
		//}
		else{ // Time 1 and 2 are the same
		      System.out.println("Both times are the same, 0 hour and 0 minute differences");
		}
	}
	public static void main(String[] args){
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter first time in 24-hour format\n-> ");
		int time1 = userinput.nextInt(10); // Enforcing base 10
		System.out.println("Please enter second time in 24-hour format\n-> ");
		int time2 = userinput.nextInt(10); // Enforcing base 10
		compute(time1, time2);

	}
}
