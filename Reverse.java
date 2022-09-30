package com.example.helloworld;

import java.util.Scanner;

public class Reverse {
    //1.Given a String and print its reverse both
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,str="";
        s=sc.nextLine();
        Reverse(s,str);
    }
    static void Reverse(String s,String str) {
        for (int i = 0; i < s.length(); i++) {
            str = str + s.charAt(s.length() - i - 1);
        }
        System.out.println("Given String: "+s);
        System.out.println("Reversed String: "+str);
    }
}
