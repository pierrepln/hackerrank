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
    StringTokenizer s=new StringTokenizer(sc.nextLine(),"[!,?.\\_'@ ]+");
    System.out.println(s.countTokens());
    while(s.hasMoreTokens()){
        System.out.println(s.nextToken());
    }

}
}
