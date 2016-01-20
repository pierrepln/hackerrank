/*
made for HackerRank Java: Java BigInteger
Wed 20 Januaray 2016

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
            BigInteger n1 = new BigInteger(sc.nextLine());
            BigInteger n2 = new BigInteger(sc.nextLine());
            
            System.out.println(n1.add(n2).toString());
            System.out.println(n1.multiply(n2).toString());
    }
}
