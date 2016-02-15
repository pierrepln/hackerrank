/*
made for HackerRank Java: Tag Content Extractor
Mon 15 February 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{

   public static void enclosedContent(String line) {
       boolean valid = false;
       int current = 0;
       int startOpenTag, endOpenTag, closeTag;

       for (int i = 0; i < line.length(); i++) {
           startOpenTag = line.indexOf("<", current);
           if(startOpenTag < 0) break;

           endOpenTag = line.indexOf(">", startOpenTag);
           if(endOpenTag < 0) break;

           String tag = line.substring(startOpenTag + 1, endOpenTag);
           if (tag.length() == 0 || tag.charAt(0) == '/') {
               current = endOpenTag + 1;
               continue;
           }

           closeTag = line.indexOf("</" + tag + ">", endOpenTag);
           if (closeTag >= 1 && line.substring(endOpenTag + 1, closeTag).length() > 0 && line.substring(endOpenTag + 1, closeTag).indexOf("<") < 0) {
               valid = true;
               System.out.println(line.substring(endOpenTag + 1, closeTag));
           }
           current = endOpenTag + 1;
       }
       if (!valid)
           System.out.println("None");
   }

   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases > 0) {
         String line = in.nextLine();
         enclosedContent(line);
         testCases--;
      }
   }
}
