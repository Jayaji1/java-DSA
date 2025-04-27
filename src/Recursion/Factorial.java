package Recursion;

import java.util.Scanner;

    public class Factorial{
        public static void main(String[] args) {
            System.out.println("enter any number");
            Scanner r=new Scanner(System.in);
            int n=r.nextInt();
            Factorial obj=new Factorial();
            int result=obj.fact(n);
            System.out.println("factorial of given number is"+result);
        }
        int fact(int n){
            if(n==1){
                return 1;
            }
            else{
                return n*fact(n-1);
            }
        }
    }

