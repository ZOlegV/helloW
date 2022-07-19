package andr;
import java.io.FileReader;
import java.util.Arrays;
import au.com.bytecode.opencsv.CSVReader;
public class ParseCSVLineByLine
{
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception
    {

        CSVReader reader = new CSVReader(new FileReader("data.csv"), ',' , '"' , 1);
        //Read CSV line by line and use the string array as you want
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {

                System.out.println(Arrays.toString(nextLine));
            }
        }
    }
}