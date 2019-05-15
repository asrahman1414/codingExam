
package math.problems;
import java.util.Scanner;

public class Fibonacci {
    //The sequence of 0 1 1 3---so  addition of first two
    //number is 3rd number and so on.. this is done by iteration. When you run the
    //the program keyboard input is needed. For forty Fibonacci number to print the
    //input should be 39. Writing java code with right comment and explanation is a
    //sign of a good programmer so there for my work is full of comments.

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  //Scanner input
        System.out.print("Enter the value of n:");
        int n = s.nextInt(); //variable has been created
        Fibonacci(n);
    }
       public static void Fibonacci(int n) {
            /*This sub-routine is a wounder full way of writing
            a clean looking program
            if else statement has been incorporated//to java from born again shell (bash) only the difference is I've never found
            "elif"
                  command in java.*/

           if (n == 0) {
            System.out.println("0");
        } else if (n == 1) {
            System.out.println("0 1");
        } else {
            System.out.print("0 1 ");
            int a = 0;  //Assigned integer value
            int b = 1;
            for (int i = 1; i < n; i++) {
                int nextNumber = a + b;
                System.out.print(nextNumber + "   ");
                a = b;
                b = nextNumber;
            }

        }

         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */


    }
}
