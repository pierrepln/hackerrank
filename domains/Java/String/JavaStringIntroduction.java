/*
made for HackerRank Java: Java Strings Introduction
Tue 19 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.printf("%d\n", (A.length()+B.length()));
        if (A.compareTo(B) > 0) {System.out.println("Yes");}
        else {System.out.println("No");}
        System.out.printf("%s %s\n", Character.toUpperCase(A.charAt(0))+A.substring(1), Character.toUpperCase(B.charAt(0))+B.substring(1));
    }
}
