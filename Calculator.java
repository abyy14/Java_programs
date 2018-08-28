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
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        Scanner s =new Scanner(System.in);
        
        System.out.println("Enter first num: ");
        double a =s.nextFloat();
        System.out.println("Enter second num: ");
       
        double b =s.nextFloat();
        
        
      
        System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.MOD\n6.Square\n7.Cube");
        System.out.println("enter option");
        int operation = s.nextInt();
        
        switch(operation){
            case 1:
            //float c =a+b;
            System.out.println("Addition: "+(a+b));
            break;
            
            case 2:
             System.out.println("Sub:"+(a-b));
             break;
             
            case 3 :
            System.out.println("Mul:"+(a*b));
            break;
            
            case 4 :
                if(b==0){
                    System.out.println("Infinity");
                    LOOP:
                    for(++b;b>0;){
                        System.out.println("enter second num: ");
                    
                        b=s.nextDouble();
                        break LOOP;
                    }
             
            System.out.println("Div:"+(a/b));
                }
            break;
            
            case 5 :
            System.out.println("Mod:"+(a%b));
            break;
            
            case 6 :
            System.out.println("Square:"+(a*a));
            System.out.println("Square:"+(b*b));
            break;
            
            case 7 :
            System.out.println("Cube:"+(a*a*a));
            System.out.println("Cube:"+(b*b*b));
            break;
            
            default :
                System.out.println("enter correct option");
            
        }
        }
        
    
    
}
