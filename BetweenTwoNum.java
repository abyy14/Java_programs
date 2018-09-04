
package calculation;

import java.util.InputMismatchException;
import java.util.Scanner;


public class BetweenTwoNum {

   
    public static void main(String[] args) {
        try{
       Scanner s=new Scanner(System.in);
       System.out.println("Enter N: ");
       double N=s.nextDouble();
       System.out.println("Enter L and R: ");
       double L=s.nextInt();
       double R=s.nextInt();
       if(N>L&&N<R){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
    }
        catch(InputMismatchException e){
            System.out.println("ENter correct input");
        }
    
}
}
