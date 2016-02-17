/*
made for HackerRank Java: Java 1D Array (Hard)
Wed 17 February 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static int[] A;
    public static int m;
    public static int n;
    public static boolean[] visitedArray;
    public static boolean result = false;

    public static void isPossible(int i) {
        if (i>n || i+m >= n || i == n-1){
            result = true;
            return;
        }
        if (visitedArray[i] == true)
            return;
        visitedArray[i]= true;
        if (i+1 < n && A[i+1] == 0)
            isPossible(i+1);
        if (i-1 >= 0 && A[i-1] == 0)
            isPossible(i-1);
        if(i+m < n && A[i+m] == 0)
            isPossible(i+m);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for (int c_i = 0; c_i < T; c_i++) {
            n = sc.nextInt();
            A = new int[n];
            visitedArray = new boolean[n];
            Arrays.fill(visitedArray, false);
            m = sc.nextInt();
            for (int n_i = 0; n_i < n; n_i++)
                A[n_i] = sc.nextInt();
            result = false;
            isPossible(0);
            if (result) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
