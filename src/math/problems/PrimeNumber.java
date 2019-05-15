package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {

        for (int i = 2; i <= 1000000; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    System.out.println(i);
                }
                if (i % j == 0) {
                    break;
                }

            }
        }
    }
}




        /*int i = 0;
        int num = 0;
        String primeNumbers = "";
        for (i = 1; i <= 1000000; i++) {
            int counter = 0;
            for (num = 1; num >= 1; num--)
                if (i % num == 0) {
                    counter = counter + 1;

                }
        }

        if (counter == 2) {
            primeNumbers = primeNumbers + i + "";

        }

    }
     System.out.println("Prime numbers from 1 to 1000000 are :")
    System.out.println(primeNumbers);
}






        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */




