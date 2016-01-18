/*
MostDistant.java made for HackerRank Contest: Ad Infinitum 14
Sat 16 Januaray 2016

Made with <3 by Pierre Plantié
*/


// This solution uses cartesian coordinates to compute distance between two points.
// I store values x and y, both min and max
// Then I compare distance between those points
// Best runtime O(N) achieved

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static double dist(int xa, int ya, int xb, int yb){
        return (Math.sqrt((Math.pow(xb - xa,2))+(Math.pow(yb - ya,2))));
    }

    public static void main(String[] args) {
        int tmp, x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        double[] dist = new double[6];
        double max = 0;
        Scanner sc = new Scanner(System.in);
        int dots = sc.nextInt();
        while (dots > 0){
            tmp = sc.nextInt();
            if (tmp != 0){
                if (tmp < 0){
                    if (x1 > tmp){x1 = tmp;}
                }
                else{
                    if (x2 < tmp){x2 = tmp;}
                }
            }
            tmp = sc.nextInt();
            if (tmp != 0){
                if (tmp < 0){
                    if (y1 > tmp){y1 = tmp;}
                }
                else{
                    if (y2 < tmp){y2 = tmp;}
                }
            }
            dots--;
        }

        dist[1] = dist(x1, 0, x2, 0);
        dist[2] = dist(x1, 0, 0, y1);
        dist[3] = dist(x1, 0, 0, y2);

        dist[4] = dist(x2, 0, 0, y1);
        dist[5] = dist(x2, 0, 0, y2);

        dist[0] = dist(0, y1, 0, y2);

        for(int i = 0; i < 6; i++){
            if(max < dist[i]){
                max = dist[i];
            }
        }
        System.out.println(max);
    }
}
