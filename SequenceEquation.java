import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the permutationEquation function below.
    public static void main(String [] args) {
        /* Create function: p_inverse */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] p_inverse = new int[n + 1];
        for (int x = 1; x <= n; x++) {
            int px = scan.nextInt();
            p_inverse[px] = x;
        }
        scan.close();
        
        /* Calculate and print each y */
        for (int x = 1; x <= n; x++) {
            int y = p_inverse[p_inverse[x]];
            System.out.println(y);
        }
    }
}
