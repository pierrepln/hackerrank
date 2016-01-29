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
        int size = sc.nextInt();
        int[] arr = new int[size];
        int smalldiff = Integer.MAX_VALUE;
        sc.nextLine();

        for (int i = 0; i < size; i++){arr[i] = sc.nextInt();}
        Arrays.sort(arr);

        int ab=0;
        for (int i = 0; i < size - 1; i++){
            ab = Math.abs(arr[i+1] - arr[i]);
            if(smalldiff > ab){
                smalldiff = ab;
            }
        }

        for (int i = 0; i < size - 1; i++){
            if (Math.abs(arr[i+1] - arr[i]) == smalldiff){
                System.out.printf("%d %d ", arr[i], arr[i+1]);
            }
        }

    }
}
