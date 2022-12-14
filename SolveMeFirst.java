/* 
Complete the function solveMeFirst to compute the sum of two integers.

Example
a = 7
b = 3

Return 10.

Function Description

solveMeFirst has the following parameters:

int a: the first value
int b: the second value

Returns
- int: the sum of  and 
*/

import java.util.*;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
      // Hint: Type return a+b; below
      return a + b;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a;
            a = in.nextInt();
            int b;
            b = in.nextInt();
            int sum;
            sum = solveMeFirst(a, b);
            System.out.println(sum);
        }
	}
}
