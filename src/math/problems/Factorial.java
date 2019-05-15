

package math.problems;
public class Factorial {

    //This is how to use iteration to find the factor of 5!

    public static void main(String[] args) {

        //This is how to use iteration to find the factor of 5!
        /*int n = 5;
        int result = 1;
        for (int i = 1;  i <= n; i++)  {
            result = result * i;
        }

      System.out.println("The factor of 5 is:"   +  result  ); */

        // To find factor of 5 by recursive

        int n = 5;
        int result = factorial(n);
        System.out.println("The factor of 5 is :" + result);

        //* Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.

        //* Write a java program to find Factorial of a given number using Recursion as well as Iteration.

        //*

        //

    }



    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return  n * factorial (n - 1);

        }
    }
}