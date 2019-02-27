import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String time = "";

        String[] timesWords = {"", "one", "two", "three", "four", "five", "six", "seven",
                            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
                         "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                     "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
		 "twenty six", "twenty seven", "twenty eight", "twenty nine"};

        if(m == 0){
            time = timesWords[h] + " o' clock";
        } else if(m == 15) {
            time = "quarter past " + timesWords[h];
        } else if(m == 30){
            time = "half past " + timesWords[h];
        } else if(m == 45){
            time = "quarter to " + timesWords[h + 1];
        } else if(m == 1){
            time = "one minute past " + timesWords[h];
        } else if(m > 1 && m < 30){
            time = timesWords[m] + " minutes past " + timesWords[h];
        } else if(m > 30 && m < 59){
            time = timesWords[60 - m] + " minutes to " + timesWords[h + 1];
        } else if(m == 59){
            time = "one minute to " + timesWords[h + 1];
        }

        return time;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
