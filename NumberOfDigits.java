
package calculation;

import java.util.InputMismatchException;
import java.util.Scanner;


public class NumberOfDigits {

   
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
