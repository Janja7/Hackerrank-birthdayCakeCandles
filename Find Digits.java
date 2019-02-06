import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int divisors = 0;

        String num = Integer.toString(n);
        int[] arr = new int[num.length()];
        String[] strings = num.split("");

        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]); 
        }

        for(int y = 0; y < arr.length; y++){
            if(arr[y] > 0 && n % arr[y] == 0){
                divisors++;
            }
        }
    
        return divisors;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
