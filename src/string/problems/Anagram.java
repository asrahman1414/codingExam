import java.util.Arrays;
import java.util.Scanner;


//package string.problems;

public class Anagram {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the first string");
        String str1 = scn.nextLine();
        System.out.println("enter the second string");

        String str2 = scn.nextLine();

        char[] word1 = str1.toLowerCase().toCharArray();
        char[] word2 = str2.toLowerCase().toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        boolean b = Arrays.equals(word1, word2);
        System.out.println("Anagram" + b);
    }
}

       /* String str3 = "customers";
        String str4 = "store scum";
        if (isAnagram(str1, str2) == true) {
            System.out.println(str1 + "is an Anagram word !!!");
        } else {
            System.out.println(str1 + "is not a anagram word");
        }
        if (isAnagram(str3, str4) == true) {
            System.out.println(str3 + "is an Anagram word");
        } else {
            System.out.println(str3 + "is not an anagram word");
        }

    }
    public static boolean isAnagram(String first, String second) {
        char[] charArray =first.toCharArray();
        char[] charArray2 = second.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray2);*/


        //return Arrays.equals(charArray,CharArray2);



        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


