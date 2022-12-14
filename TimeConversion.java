/*
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * 
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 * 
 * Example
 * s = "12:01:00PM"
 * Return "12:01:00"
 * 
 * s = "12:01:00AM"
 * Reuturn "00:01:00"
 */

import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String newTime = "";

        //PM cases
        if (s.indexOf("PM") != -1){
            int a = Integer.parseInt(s.substring(0, 2));
            if (a != 12) {
                a += 12;
            }
            newTime = a + s.substring(2);
            newTime = newTime.replace("PM", "");
        
        //AM cases
        } else if (s.indexOf("AM") != -1) {
            newTime = s.replace("AM", "");
            //System.out.println(newTime);
            if (newTime.substring(0, 2).equals("12")){
                newTime = "00" + newTime.substring(2);
            }
        }
        
        return newTime;
        

    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
