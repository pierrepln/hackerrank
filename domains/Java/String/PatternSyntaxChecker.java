/*
made for HackerRank Java: Pattern Syntax Checker
Tue 19 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());

      while(testCases>0) {
         String pattern = in.nextLine();
          try {
              Pattern p = Pattern.compile(pattern);
              System.out.println("Valid");
         }
         catch (PatternSyntaxException e) {
             System.out.println("Invalid");
         }

      }
   }
}
