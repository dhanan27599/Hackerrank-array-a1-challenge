import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        if(s.endsWith("PM") && !s.substring(0,2).equals("12")) {
            int hours = 12 + Integer.parseInt(s.substring(0, 2));
            String rem = s.substring(2, 8);
            return hours + rem;
        } else {
            if(s.substring(0, 2).equals("12") && s.endsWith("AM")) {
                String hours = "00";
                String rem = s.substring(2, 8);
                return hours + rem;
            } else {
                return s.substring(0, 8);
            }
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
