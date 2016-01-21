/*
made for HackerRank Java: Java 1D Array (Easy)
Thu 21 Januaray 2016

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
        int n = sc.nextInt();
        sc.nextLine();

        int[] myList = new int[n];
        for (int i = 0; i < n; i++) {
            myList[i] = sc.nextInt();
        }

        int count = 0;
        int tmp;
        for (int i = 0; i < n; i++) {
            tmp = 0;
            for (int j = i; j < n; j++) {
                tmp += myList[j];
                if (tmp < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
