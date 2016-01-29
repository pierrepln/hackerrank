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
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int res = a;
            for (int j = 0; j < n; j++)
            {
                res += (Math.pow(2, j) * b);
                System.out.printf("%d ", res);
            }
            System.out.println("");
        }
    }
}
