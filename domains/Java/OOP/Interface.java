/*
made for HackerRank Java: Java Interface
Tue 26 Januaray 2016

Made with <3 by Pierre Plantié
*/

class MyCalculator implements AdvancedArithmetic
{
    public MyCalculator(){}

    public int divisorSum(int n) {
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}
