package com.example.helloworld;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s;
        int i;
        s=sc.nextLine();
        s=s.toUpperCase();
        for(i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
                System.out.println("Not Palindrome");
                break;
            }
        }
        if(i==s.length()/2)
            System.out.println("Palindrome");
    }
}
