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

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1)ans = "Weird";
        else
        {
               if (n>=6 && n<=20)ans = "Weird";
            else{
                ans = "Not Weird";
            }
        }
        System.out.println(ans);

    }
}
