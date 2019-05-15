package math.problems;

public class MakePyramid {
    public static void main(String[] args) {


        //public static void main (String[]args){
            //for spaces
            //for stars
            for (int i = 0; i < 6; i++) {
                for (int x = 5; x >= i; x--) {
                    System.out.print(" ");
                }
                for (int z = 0; z <= i; z++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }

        }

    }


    /*   Implement a large Pyramid of stars in the screen with java.

                *
               * *
              * * *
             * * * *
            * * * * *
           * * * * * *

         */



