
package calculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNaturalNum {

 
    public static void main(String[] args) {
       
        try{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the num");
        int num=s.nextInt();
        int sum=0;
        if(num!=0&&!(num<0)){
        for(int i=1;i<=num;i++){
            sum=sum+i;
            
        }
        System.out.println("Sum: "+sum);
    }else {
            System.out.println("dont give value as 0 or negative");
           
        }
        }
    
    catch(InputMismatchException e){
        System.out.println("Enter the natural numbers");
    }
        }
}
