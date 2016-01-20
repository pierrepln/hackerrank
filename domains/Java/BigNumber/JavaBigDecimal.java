/*
made for HackerRank Java: Java BigDecimal
Wed 20 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.math.BigDecimal;
import java.util.*;

class Solution {

  public static void main(String []argh) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String []s = new String[n];
      for(int i = 0; i < n; i++) {
          s[i] = sc.next();
      }
      Arrays.sort(s, new Comparator<String>() {
              public int compare(String first, String second) {
                  BigDecimal bdFirst = new BigDecimal(first);
                  BigDecimal bdSecond = new BigDecimal(second);
                  int res = first.compareTo(second);
                  return (res == 0) ? res : bdSecond.compareTo(bdFirst);
              }
      });

      for(int i = 0; i < n; i++) {
          System.out.println(s[i]);
      }

  }

}
