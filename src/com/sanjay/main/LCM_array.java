package com.sanjay.main;


//find the lcm in array element
public class LCM_array {
    public static void main(String[] args) {

        int arr[]={8,4,2,16};

        int lcm=arr[0];
        int gcd=arr[0];

        for(int i=1;i<arr.length;i++){
            gcd=findGCD(arr[i],lcm);
            lcm=(lcm*arr[i])/gcd;
        }
        System.out.println("LCM :" +lcm);

    }
    public static int findGCD(int a,int b){
        if(b==0)
            return a;
        return findGCD(b,a%b);
    }
}
