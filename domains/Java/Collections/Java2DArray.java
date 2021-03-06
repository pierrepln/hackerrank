/*
made for HackerRank Java: Java 2D Array
Thu 21 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int sum_hourglass(int[][] arr, int i, int j) {
        try {
            return(arr[i][j] + arr[i][j+1] + arr[i][j+2] + //hourglass top
                    arr[i+1][j+1] + //hourglass mid
                    arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]); //hourglass bot
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return (-100);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int res = -100;

        for(int i=0; i < 6; i++) {
            for(int j=0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0; i < 6; i++) {
            for(int j=0; j < 6; j++) {
                if (sum_hourglass(arr, i, j) > res) {
                    res = sum_hourglass(arr, i, j);
                }
            }
        }
        System.out.println(res);
    }
}
