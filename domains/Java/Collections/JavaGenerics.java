/*
made for HackerRank Java: Java Generics
Mon 25 Januaray 2016

Made with <3 by Pierre Plantié
*/

class Printer
{
       static <E> void printArray(E[] element) {
           for (E i : element) {
               System.out.println(i);
           }
       }
}
