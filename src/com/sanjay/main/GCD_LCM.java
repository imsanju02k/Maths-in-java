package com.sanjay.main;

import java.util.Scanner;

// find the all prime factors of both number are 15 and 20
public class GCD_LCM {
    static int gcd(int a , int b){
        if (a==0)
            return b;
        return gcd(b% a,a);
    }
    static int lcm(int a,int b){
        return (a/gcd(a, b))*b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println("LCM of " +a + " and " +b + " is "+lcm(a,b));
    }
}
// time complexity : O(log(max(a,b));
// Space:same
