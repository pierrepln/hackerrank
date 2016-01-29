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

class Date {
    public int d;
    public int m;
    public int y;

    public Date(int day, int month, int year) {
        this.d = day;
        this.m = month;
        this.y = year;
    }

}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date actual = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Date expected = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
        int fine = 0;

        if (actual.y > expected.y)
            fine = 10000;
        else if (actual.y == expected.y) {
            if (actual.m > expected.m)
                fine = 500 * (actual.m - expected.m);
            else if (actual.m == expected.m) {
                if (actual.d > expected.d)
                    fine = 15 * (actual.d - expected.d);
            }
        }

        System.out.println(fine);
    }
}
