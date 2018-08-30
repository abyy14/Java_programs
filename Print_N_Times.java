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
public class Print_N_Times {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
          String str="Hello";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of times to print: ");
      long N=s.nextLong();
      if(N!=0&&!(N<0)){
          
      
      for(int i=1;i<=N;i++){
          System.out.println(str);
      }
      }else
      {
          System.out.println("Dont give value as 0 or negative");
          System.out.println("enter the num again");
           N=s.nextLong();
         
          for(int i=1;i<=N;i++){
              System.out.println(str);
          }
      }
        
    }
        catch(InputMismatchException e){
            System.out.println("Enter positive and integer value");
        }
    
}
}
