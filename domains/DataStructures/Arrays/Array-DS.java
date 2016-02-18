/*
made for HackerRank DataStructures: Array-DS
Thu 18th February 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++)
            arr[arr_i] = in.nextInt();
        for(int arr_i=n-1; arr_i >= 0; arr_i--) {
            System.out.printf("%d", arr[arr_i]);
            if (arr_i != 0)
                System.out.printf(" ");
        }
    }
}
