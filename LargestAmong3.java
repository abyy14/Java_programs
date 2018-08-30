
package calculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestAmong3 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 nums");
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
        //double largest=a;
        if(b>a&&c<b){
          System.out.println("largest: "+b);
        }else if(c>a&&b<c){
            System.out.println("largest: "+c);
            
        }else {
            System.out.println("largest: "+a);
        }
    }
    
    catch(InputMismatchException e){
    System.out.println("Invalid input");
}
    
}
}
