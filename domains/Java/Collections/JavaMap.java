/*
made for HackerRank Java: Java Map
Thu 21 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.util.*;
import java.io.*;

class Solution {

   public static void main(String []argh) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      in.nextLine();
      Map map = new HashMap();

      for(int i = 0; i < n; i++) {
         String name = in.nextLine();
         int phone = in.nextInt();
         map.put(name, phone);
         in.nextLine();
      }
      while(in.hasNext()) {
         String s = in.nextLine();
         if (map.get(s) != null) {
             System.out.printf("%s=%s\n", s, map.get(s).toString());
         }
         else {
             System.out.println("Not found");
         }
      }
   }
}
