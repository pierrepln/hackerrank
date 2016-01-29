/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

class Calculator{

    Calculator(){}

    public static int power(int n, int p) throws Exception{
        if (n >= 0 && p >= 0){
            return((int) Math.pow(n, p));
        }
        else{
            throw new Exception("n and p should be non-negative");
        }
    }
}
