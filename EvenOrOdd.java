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
public class EvenOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the num:");
        double a=s.nextDouble();
        if(a%2==0){
            System.out.println("Even");
        }else if(a<0){
            System.out.println("Invalid");
        }
        else{
            System.out.println("Odd");
        }
    }
        catch(InputMismatchException e){
            System.out.println("Enter the numeric value only");
        }
    }
    
}
