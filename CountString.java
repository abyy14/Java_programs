/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *
 * @author MSAJCE
 */
public class CountString {
    public static void main(String[] args){
         String str = "abcd123@*&";
         count(str);
              
        
    }
    public static void count(String x){
        char[] arr=x.toCharArray();
        int letter=0;
        int num=0;
        int alphanumeric=0;
        for(int i=0;i<arr.length;i++){
        if(Character.isLetter(arr[i])){
            letter++;
        }
        else if(Character.isDigit(arr[i])){
            num++;
        }
        else {
            alphanumeric++;
        }
    }
        System.out.println("Number of letters,numeric,alphanumeric");
        System.out.println("Character: "+letter);
        System.out.println("Numeric: "+num);
        System.out.println("Alphanumeric: "+alphanumeric);
}
}
        
