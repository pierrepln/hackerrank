/*
made for HackerRank Java: Java End-of-file
Tue 19 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        
        while (sc.hasNext()){
            String s = sc.nextLine();
            System.out.printf("%d %s\n", i, s);
            i++;
        }
    }
}
