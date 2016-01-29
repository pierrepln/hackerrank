/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static boolean isPrime(int num) {
            if (num == 2 ) return true;
            if (num % 2 == 0) return false;
            for (int i = 3; i * i <= num; i += 2)
                if (num % i == 0) return false;
            return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0) {
            int nb = s.nextInt();
            if (nb > 1) {
                if (isPrime(nb))
                    System.out.println("Prime");
                else
                    System.out.println("Not prime");
            }
            else if (nb == 1)
                    System.out.println("Not prime");
            else
                    System.out.println("Not prime");
            n--;
        }
    }
}
