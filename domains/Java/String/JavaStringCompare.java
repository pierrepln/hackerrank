/*
made for HackerRank Java: Java String Compare
Tue 19 Januaray 2016

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
        String s = sc.nextLine();
        int n = sc.nextInt();
        String min = new String();
        String max = new String();

        for(int i=0; i <= s.length()-n; i++) {
            if (i == 0) {min = s.substring(i, i+n);max = s.substring(i, i+n);}
            if (s.substring(i, i+n).compareTo(min) < 0) {min = s.substring(i, i+n);}
            if (s.substring(i, i+n).compareTo(max) > 0) {max = s.substring(i, i+n);}
        }
        System.out.printf("%s\n%s\n",min, max);
    }
}
