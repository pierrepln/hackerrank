/*
made for HackerRank Java: Java Hashset
Sun 24 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      HashSet hs = new HashSet();
      Scanner sc = new Scanner(System.in);
      sc.nextLine();
      
      while (sc.hasNext()) {
          hs.add(sc.nextLine());
          System.out.println(hs.size());
      }
    }
}
