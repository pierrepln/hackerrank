/*
made for HackerRank Java: Java Stack
Thu 21 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.util.*;

class Solution{

   public static boolean is_balanced(char[] s) {
       Stack<Character> stack = new Stack<Character>();

       try {
           for (int i = 0; i < s.length; i++) {
               if (s[i] == '(' || s[i] == '{' || s[i] == '[') {
                   stack.push(s[i]);
               }
               else if (s[i] == ')' && stack.peek() == '(' ) {
                   stack.pop();
               }
               else if (s[i] == '}' && stack.peek() == '{' ) {
                   stack.pop();
               }
               else if (s[i] == ']' && stack.peek() == '[' ) {
                   stack.pop();
               }
               else return false;
           }
           return (stack.empty());
       }
       catch (EmptyStackException e){
           return false;
       }
   }

   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         System.out.println(is_balanced(sc.next().toCharArray()));
      }

   }
}
