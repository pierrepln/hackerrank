/*
HackerRank Week of Code - 19 : Fix the Cycles
Tue 16 February 2016

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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        List<Integer> path = new ArrayList();
        // Only 3 paths
        path.add(b + c + d + a);
        path.add(b + f + a);
        path.add(e + d + a);
        if (Collections.min(path) >= 0)
            System.out.println(0);
        else
            System.out.println(Math.abs(Collections.min(path)));
    }
}
