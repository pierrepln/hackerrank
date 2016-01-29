/*
HackerRank Contest : 30 Days of code
Sat 30 Januaray 2016

Made with <3 by Pierre Plantié
*/

object Solution {

     def gcd(x: Int, y: Int): Int =
   {
    if (x == y) {
        return x;
    }
    else {
        if (x > y){
            return (gcd(x - y, y));
        }
        else {
            return (gcd(y-x, x));
        }
    }
   }


/**This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair:List[Int]) = {
      println(gcd(pair.head,pair.reverse.head))
  }

    def main(args: Array[String]) {
/** The part relates to the input/output. Do not change or modify it **/
         acceptInputAndComputeGCD(readLine().trim().split(" ").map(x=>x.toInt).toList)

    }
}
