/*
made for HackerRank Java: Java If-Else
Tue 19 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";

        if(n%2==1){ans = "Weird";}
        else{
            //2 and 5(inclusive), print "Not Weird"
            if(n >= 2 && n <= 5){ans = "Not Weird";}
            // in between the range of 6 and 20(inclusive), print "Weird"
            else if(n >= 6 && n <= 20){ans = "Weird";}
            // > 20 Not Weird
            else if(n > 20){ans = "Not Weird";}
        }
        System.out.println(ans);
    }
}
