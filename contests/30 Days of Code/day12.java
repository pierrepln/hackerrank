/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

class Grade extends Student{
    int score;

    public Grade(String fname, String lname, int p, int s){
        super(fname, lname, p);
        score = s;
    }

    public char calculate(){
        if (score < 40){
            return ('D');
        }
        if (score >= 40 && score < 60){
            return ('B');
        }
        if (score >= 60 && score < 75){
            return ('A');
        }
        if (score >= 75 && score < 90){
            return ('E');
        }
        if (score >= 90 && score <= 100){
            return ('O');
        }
        return ('0');
    }
}
