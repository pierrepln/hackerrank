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
    public static int hourglass(int[][] arr, int i, int j) {
        try{
            return(arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            return (-999);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int res = -999;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                if (res < hourglass(arr, i, j)){
                    res = hourglass(arr, i, j);
                }
            }
        }
        System.out.println(res);
    }
}
