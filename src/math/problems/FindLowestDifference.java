package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int[] A = FindLowestDifference.Sort(array1);
        int[] B = FindLowestDifference.Sort(array2);

        int n1 = A[A.length - 1];
        for (int i = 0; i < A.length - 1; i++) {
            int a = (A[i + 1] - A[i]);
            if (a < n1)
                n1 = a;
        }
        int n = n1;
        int n2 = 47;
        for (int i = 0; i < A.length - 1; i++) {
            int a = (A[i + 1] - A[i]);
            if (a < n2)
                n2 = a;

        }
        if (n2 < n1)
            n = n2;
        System.out.println(n);

    }

    public static int[] Sort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }
            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
        return list;
    }


}

/* Implement in java.
     Read this below two array. Find the lowest difference between the two array cell.
     The lowest difference between cells is 1*/
//public static int FindLowestDifference(int a1[], int a2[]) {

         //public static  void main (int a1[], int a2[]) {
       // int minDiff = integer.Max_Value;
       // int min1 = -1;
       // int min2 = -1;
       // int i = 0;
       // int j = 0;
        //int n1 = a1.length;
        //int n2 = a2.length;
        //int diff = 0;
       // Arrays.sort(a1);
        //Arrays.sort(a2);
      //  while (i < n1 && j < n2) {
          //  diff = Math.abs(a1[i] - a2[j]);
          //  if (diff < minDiff) {
             //   minDiff = diff;
               // min1 = a1[i];
                //min2 = a2[j];
           // }
           // if (a1[i] < a2[j]) {
              //  i++;

           // } else {
              // j++;

           // }

      //  }
  //  }
//}

