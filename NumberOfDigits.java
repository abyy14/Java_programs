/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sarala
 */
public class NumberOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
        
        int count = 0;
        Scanner s=new Scanner(System.in);
        long num =s.nextLong();

        for(; num != 0; num/=10, ++count) {   
        }

        System.out.println("Number of digits: " + count);
    }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
    
}
