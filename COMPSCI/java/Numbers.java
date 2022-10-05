public class Numbers{
   public static void main(String[] args){
      String numbers = "12345";
      for(int i = 0; i < numbers.length(); ++i){
	 String num = Character.toString(numbers.charAt(i));
	 System.out.println(Integer.parseInt(num));
      }
   }
}
