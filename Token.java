/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.io.*;
import java.util.*;
import java.lang.*;

/**
 *
 * @author MSAJCE
 */
public class Token {
    public static void main(String[] args){
        String str1="Mr.Jack,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
        String str2="Ms Jill,Door No 53,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
        String str3="Mr Holmes,Door No 13,Valmiki Street,32d Main Road,Saidapet,Chennai,Pin-600115";
        String str4="Mr.Davinci,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
        StringTokenizer st1 = new StringTokenizer(str1);
        StringTokenizer st2 = new StringTokenizer(str2);
        StringTokenizer st3 = new StringTokenizer(str3);
        StringTokenizer st4 = new StringTokenizer(str4);
        
        while(st1.hasMoreTokens()||st2.hasMoreTokens()||st3.hasMoreTokens()||st4.hasMoreTokens()){
            System.out.println(st1.nextToken(","));
            //break;
             System.out.println(st2.nextToken(","));
              System.out.println(st3.nextToken(","));
              System.out.println(st4.nextToken(","));
            break;
        }
        
    }
    
}
