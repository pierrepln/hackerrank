/*
made for HackerRank Java: Prime Checker
Thu 11th February 2016

Made with <3 by Pierre Plantié
*/

import static java.lang.System.*;

class Prime {

    static boolean isPrime(int num) {
        if (num == 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i=3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    public static void checkPrime(int... num) {
        for(int i=0; i < num.length; i++) {
            if (isPrime(num[i]))
                System.out.printf("%d ", num[i]);
        }
        System.out.println();
    }
}
