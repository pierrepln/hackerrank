/*
made for HackerRank Java: Java ArrayList
Mon 24 Januaray 2016

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
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<ArrayList> outer = new ArrayList<ArrayList>(n);
        for (int i = 0; i < n; i++) {
            int size = sc.nextInt();
            ArrayList inner = new ArrayList(size);
            for (int j=0; j < size; j++) {
                inner.add(j, sc.nextInt());
            }
            outer.add(i, inner);
            sc.nextLine();
        }

        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            sc.nextLine();

            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                System.out.println(outer.get(x - 1).get(y-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }

        }





    }
}
