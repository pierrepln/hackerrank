/*
made for HackerRank Java: Java Exception Handling
Thu 4th February 2016

Made with <3 by Pierre Plantié
*/

class myCalculator
{
    myCalculator(){}

    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");
        else
            return (int) Math.pow(n, p);
    }
}
