/*
made for HackerRank Java: Java Loops
Tue 19 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        for (int i=0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            double res = 0;
            for (int j = 0; j < n; j++) {
                res += Math.pow(2,j) * b;
                System.out.printf("%.0f ", res + a);
            }
            System.out.println();
        }
    }
}
