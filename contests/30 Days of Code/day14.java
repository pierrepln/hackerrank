/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

public Difference(int[] a){
    elements = a;
}

public void computeDifference(){

    for (int j =0; j < elements.length; j++){

        for (int i =0; i < elements.length; i++){
            if (Math.abs(elements[j] - elements[i]) > maximumDifference){
              maximumDifference = Math.abs(elements[j] - elements[i]);
            }
        }
    }
}
