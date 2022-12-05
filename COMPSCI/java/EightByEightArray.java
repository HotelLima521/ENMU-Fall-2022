public class EightByEightArray {
   public static void main(String[] args){
      char whiteSquare = '\u25A1';
      char blackSquare = '\u25A0';
      int x = 8;
      int y = 8;
      char[][] array = new char[x][y];
      for(int i = 0; i < y; i++){
	 for(int j = 0; j < x; j++){
	    if(i % 2 == 0 && j % 2 == 0){
	       array[i][j] = whiteSquare;
	    }
	    else if(i % 2 == 0 && j % 2 != 0){
	       array[i][j] = blackSquare;
	    }
	    else if(i % 2 != 0 && j % 2 != 0){
	       array[i][j] = whiteSquare;
	    }
	    else{
	       array[i][j] = blackSquare;
	    }
	 }
      }
      for(int i = 0; i < y; i++){
	 for(int j = 0; j < x; j++){
	    System.out.printf("%c ", array[i][j]);
	 }
	 System.out.println();
      }
   }
}
