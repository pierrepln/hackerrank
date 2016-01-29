/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

class Calculator implements AdvancedArithmetic{

    Calculator(){}

    public int divisorSum(int n){
        int sum = 0;
        for (int i = n; i > 0; i--){
            if (n%i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
