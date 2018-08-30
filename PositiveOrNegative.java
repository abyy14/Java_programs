/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;
import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *
 * @author Sarala
 */
public class PositiveOrNegative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the num:");
        double a=s.nextDouble();
        if(a<0){
            System.out.println("negative");
        }else
        {
            System.out.println("Positive");
        }
    }
        catch(InputMismatchException e){
            System.out.println("Enter the numeric value only");
        }
    }
    
}
