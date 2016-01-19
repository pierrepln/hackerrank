/*
made for HackerRank Java: Java Output Formatting
Tue 19 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1 = sc.next();
                int x = sc.nextInt();
                System.out.printf("%-15s%03d\n", s1, x);
            }
            System.out.println("================================");

    }
}
