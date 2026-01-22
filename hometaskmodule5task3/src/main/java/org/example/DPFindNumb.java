package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DPFindNumb {
    static int[] memo;
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(memo[n] != 0){
            return memo[n];
        }
        memo[n] = fib(n-1) + fib(n-2);
        return memo[n];
    }
    public static void main(String[] args) {
        int n = 6;
        memo = new int[n+1];
        System.out.println(fib(n));
    }
}