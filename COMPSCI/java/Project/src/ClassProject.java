import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/*
   This program will parse data of "finalLayout.txt", and will use that information to then parse data in the file "finalData.txt".
   Output of the data will then go into the file "finalReport.txt" ** OR ** "finalReport.xlsx", and will show:
      - Top Five and Bottom five AGE and RACE layout Field categories by:
	 - Geographical Identifier
	 - Data Field categories
      For each Geographical category in the Data file.
   
   An example of the output is already in the filesIn dir as "finalReport.xlsx".

*/
public class ClassProject {
   public static void main(String[] args) throws IOException{
      String filesInFolder = "../files/filesIn/";
      String filesOutFolder = "../files/filesOut/";
      String finalDataText = "finalData.txt";
      String finalLayoutText = "finalLayout.txt";
      //String finalReportSheet = "finalReport.xlsx";
      File finalData = new File(filesInFolder + finalDataText);
      File finalLayout = new File(filesInFolder + finalLayoutText);
      //File finalReport = new File(filesOutFolder + finalReportSheet);
      Scanner in = new Scanner(finalLayout);
      while(in.hasNextLine()){
	 String line = in.nextLine();
	 if(line.indexOf("Years") != -1){
	    String[] result = line.split(" DIV");
	    /*line = result[1];
	    line = line.replaceAll(" ", ";");
	    line = replaceAll(" ", ";");
	    String[] tokens = line.split(";");
	    WriteTo(finalReport, result[0] + Arrays.toString(tokens));*/
	    String[] inNumbers = result[1].split("  ");
	    System.out.println(inNumbers);
	 }
      }
      /*try{
	 PrintWriter out = new PrintWriter(finalReport);
	 out.printf("%s\n", line);
	 out.close(); //Sends write command
      }
      catch(FileNotFoundException e){
	 e.printStackTrace();
      }*/

   }

  /* public static File finalTextFunc(File finalData, finalLayout){
      /**
       * This function will process the data within the file "finalData.txt" as an input, and output it as "outputReport.txt"
       * @param finalData
       * @param finalLayout
       * @return outputReport
       /
      return outputReport;
   }
*/
}
