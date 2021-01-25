import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the dayOfProgrammer function below.
    // return new StringBuilder("13.09." + year).toString();
    // return new StringBuilder("12.09." + year).toString();
    static String dayOfProgrammer(int year) {
        // System.out.println(year % 4 + ", " + year % 100 + ", " + year % 400);
        String s = new String();
        if(year == 1918) {
            return new StringBuilder("26.09." + year).toString();
        } else if(year >= 1919) {
            if(year % 400 == 0 || (year % 4 == 0  && year % 100 != 0)) {
                s = new StringBuilder("12.09." + year).toString();
            } else {
                s = new StringBuilder("13.09." + year).toString();
            }
        } else if(year <= 1917) {
            if(year % 4 == 0) {
                s = new StringBuilder("12.09." + year).toString();
            } else {
                s = new StringBuilder("13.09." + year).toString();
            }
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
