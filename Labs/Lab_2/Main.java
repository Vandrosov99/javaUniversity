package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("helloslkh.\n" +
                "ellod jladfj.\n"  +
                "hello.");
        String findStr = "hello";
        int lastIndex = 0;
        int count = 0;
    System.out.println(("Your TEXT:" ));
    System.out.println(str);
        while(lastIndex != -1){

            lastIndex = str.indexOf(findStr,lastIndex);
          //  System.out.println(lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += findStr.length();
                str.insert(lastIndex,"231");

            }
        }
        System.out.println("Your changed text :" );
        System.out.println(str);
        System.out.println("Count of your word :");
        System.out.println(count);

    }
}
