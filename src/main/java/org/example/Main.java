package org.example;

public class Main {
    public static void main(String[] args) {
        printEqual(1,1,1);
    }

    public static void printEqual(int a, int b, int c){
        // Check if the input is valid
        if(a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Value");
            return;
        }

        // Check if the input is equal
        if((a == c) && (b == c)){
            System.out.println("All numbers are equal");
        }
        else if((a!=b) && (a!=c) && (b!=c)){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }
}