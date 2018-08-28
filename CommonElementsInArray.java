/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author MSAJCE
 */
public class CommonElementsInArray {
    public static void main(String[] args){
    int[] arr1={2,3,4,5,6,7};
    int[] arr2={9,8,7,6,1};
    for(int i=0;i<arr1.length;i++){
    for(int j=0;j<arr2.length;j++){
        if(arr1[i]==arr2[j])
            System.out.println(arr1[i]);
    }
}
    
}
}
