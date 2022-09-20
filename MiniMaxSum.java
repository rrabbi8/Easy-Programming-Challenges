/*
 * Given five positive integers, find the minimum and maximum values 
 * that can be calculated by summing exactly four of the five integers.
 *  
 * Then print the respective minimum and maximum values as a single line of 
 * two space-separated long integers.
 * 
 * Example
 * arr = [1,3,5,7,9]
 * The minimum sum is 1+3+5+7 = 16 and the maximum sum is 3+5+7+9=24. 


 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        //List<Integer> newArr = new ArrayList();
        Collections.sort(arr);
        //System.out.println(arr);
        long max = 0, min = 0;
        for (int i=1, j = 0; i<arr.size() && j<arr.size() - 1; i++, j++){
            max += arr.get(i);
            min += arr.get(j);
        }
        
        System.out.print(min + " " + max);
    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
