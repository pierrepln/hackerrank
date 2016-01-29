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

public class Arithmetic {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage


      int total = (int) Math.round(((M*T)/100)+((M*X)/100)+M);

      System.out.printf("The final price of the meal is $%d.\n", total);
    }
}
