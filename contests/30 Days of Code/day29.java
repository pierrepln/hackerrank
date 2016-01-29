/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();

        while (testCases > 0) {
            String str = sc.nextLine();
            char[] s = str.toCharArray();
            char[] r = new StringBuilder(str).reverse().toString().toCharArray();
            boolean funny = true;

            for (int i = 1; i < str.length(); i++) {
                int n1 = Math.abs((int)(s[i] - s[i-1]));
                int n2 = Math.abs((int)(r[i] - r[i-1]));

                if (n1 != n2){
                    funny = false;
                    System.out.println("Not Funny");
                    i = str.length();
                }
            }
            if (funny == true)
                System.out.println("Funny");
            testCases--;
        }
    }
}
