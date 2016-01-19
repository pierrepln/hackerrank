/*
made for HackerRank Java: Java String Reverse
Tue 19 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String B = new StringBuffer(A).reverse().toString();
        if (A.compareTo(B) == 0) {System.out.println("Yes");}
        else {System.out.println("No");}

    }
}
