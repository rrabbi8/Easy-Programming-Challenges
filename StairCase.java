/*
 * This is a staircase of size n = 4
 *    #
 *   ##
 *  ###
 * ####
 * 
 * It's base and height are both equal to n. 
 * It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
 */

import java.io.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
        int line = 1;
        for (int i=n; i>0; i--){
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<line; k++){
                System.out.print("#");
            }
            line += 1;
            System.out.println(); 
        }

    }

}

public class StairCase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
