/*
made for HackerRank Java: Java Inheritance1
Tue 26 Januaray 2016

Made with <3 by Pierre Plantié
*/

class Animal{
   void walk()
   {
      System.out.println("I am walking");
   }
}

class Bird extends Animal
{
   void fly()
   {
      System.out.println("I am flying");
   }
   void sing()
   {
      System.out.println("I am singing");
   }
}

public class Solution
{
   public static void main(String args[])
   {
     Bird bird = new Bird();
     bird.walk();
     bird.fly();
     bird.sing();
   }
}
