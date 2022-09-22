public class balance {
	public static void main(String[] args){
		double balance = 1000;
		double interest = .05;
		double balance_interest;
		int i = 1;
		while(i < 4){
			System.out.println("Year " + i);
			balance_interest = interest;
			balance += balance_interest;
			System.out.println("Balance is: " + '$' + balance);
			i++;
		}
	}
}
