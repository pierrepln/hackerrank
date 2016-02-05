/*
made for HackerRank Java: Java Varargs - Simple Addition
Fri 5th February 2016

Made with <3 by Pierre Plantié
*/

class Add {

    void add(int... nb) {
        int sum = 0;
        boolean start = true;

        for (int item : nb) {
            sum += item;
            if (!start)
                System.out.printf("+");
            System.out.printf("%d", item);
            start = false;
        }
        System.out.printf("=%d\n", sum);
    }
}
