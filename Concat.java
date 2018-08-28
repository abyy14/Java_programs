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
public class Concat {
    public static void main(String[] args){
        String st1="Hello World";
        char[] arr1=st1.toCharArray();
        String st2="HelloWorld";
        char[] arr2=st2.toCharArray();
        //for(int i=0;i<arr1.length;)
        if(arr1.length==arr2.length){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        
        
    }
    
}
