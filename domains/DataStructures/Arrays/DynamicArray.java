/*
made for HackerRank DataStructures: Dynamic Array
Fri 19th February 2016

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
        int lastans = 0;
        int N = sc.nextInt();
        int Q = sc.nextInt();
        ArrayList[] sequences = new ArrayList[N];
        for (int i=0; i < N; i++)
            sequences[i] = new ArrayList();

        for (int i=0; i < Q; i++) {
            sc.nextLine();
            int type = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (type == 1) //Insert y at the end of the ((x ^ lastans) % N)th sequence
                sequences[(x ^ lastans) % N].add(y);
            else if (type == 2) { //Print the value of (y % size)th elem of ((x ^ lastans) % N)th sequence
                lastans = (int) sequences[(x ^ lastans) % N].get(y % (int) sequences[(x ^ lastans) % N].size());
                System.out.println(lastans);
            }
        }
    }
}
