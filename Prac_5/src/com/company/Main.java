package com.company;

public class Main {

    public static void func1(int n){
        if(n>1){
            func1(n-1);
        }
        System.out.println(n);
    }
    public static void func2(int A,int B){
        if(A>B){
            System.out.println(A);
            func2(A-1,B);
        }
        if(A<B){
            func2(A,B-1);
            System.out.println(B);
        }
        else{
            System.out.println(A);
        }
    }
    public static int func3(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += func3(len + 1, sum + i, k, s);
        }
        return res;
    }
    public static void main(String[] args) {
        //func1(15);
        //func2(1 ,5);
        System.out.println(func3(0, 0, 3, 15));
    }
}
