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
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int h = 0; h < n; h++)
        {
            for(int w = 0; w < n; w++)
            {
                if ((w + 1) >= (n - h)){
                    System.out.printf("#");
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
