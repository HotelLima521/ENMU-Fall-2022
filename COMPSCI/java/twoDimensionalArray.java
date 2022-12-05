public class twoDimensionalArray{
   public static void main(String[] args){
      
      int COUNTRIES = 7;
      int MEDALS = 3;
      String[] countries =
	 {
	    "Canada",
	    "China",
	    "Germany",
	    "Korea",
	    "Japan",
	    "Russia",
	    "United States"
	 };
      int[][] counts = new int[COUNTRIES][MEDALS];
      int[][] counts =
      {
	 {1,0,1},
	 {1,1,0},
	 {0,0,1},
	 {1,0,0},
	 {0,1,1},
	 {0,1,1},
	 {1,1,0}
      };
      System.out.println("	Countries Gold Silver Bronze Total");
      for(int i = 0; i < COUNTRIES; i++){
	 System.out.printf("%15s", countries[i]);
	 int total = 0;
	 for(int j = 0; j < MEDALS; j++){
	    System.out.printf("%8d", counts[i][j]);
	    total += counts[i][j];
	 }
	 System.out.println();
      }
      System.out.printf("%d\n", total);
   }
}
