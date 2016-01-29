/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

class MyBook extends Book
{
    int price;

    MyBook(String t, String a, int p){
        super(t, a);
        price = p;
    }

    void display(){
        System.out.printf("Title: %s\n", title);
        System.out.printf("Author: %s\n", author);
        System.out.printf("Price: %d\n", price);
    }
}
