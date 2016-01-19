/*
made for HackerRank Java: Java String Token
Tue 19 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine();

      StringTokenizer st = new StringTokenizer(s, " !,?.\'@_");
      int n = st.countTokens();
      System.out.println(n);
      while(st.hasMoreTokens()) {
        System.out.println(st.nextToken());
      }
    }
}
