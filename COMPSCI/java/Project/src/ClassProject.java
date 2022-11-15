import java.io.File;
public class ClassProject {
   public static void main(String[] args){
      String filesFolder = "../src/";
      String finalDataText = "finalData.txt";
      String finalLayoutText = "finalLayout.txt";
      String finalReportSheet = "finalReport.xlsx";
      File finalData = new File(filesFolder + finalDataText);
      File finalLayout = new File(filesFolder + finalLayoutText);
      File finalReport = new File(filesFolder + finalReportSheet);
   }
}
