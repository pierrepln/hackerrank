/*
made for HackerRank Java: Java Anagrams
Tue 19 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
       A = A.toLowerCase();
       B = B.toLowerCase();
       char[] aa = A.toCharArray();
       char[] bb = B.toCharArray();

       Arrays.sort(aa);
       Arrays.sort(bb);
       if (Arrays.equals(aa, bb)) {return true;}
       return false;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        boolean ret = isAnagram(A,B);
        if(ret) {System.out.println("Anagrams");}
        else {System.out.println("Not Anagrams");}
    }
}
