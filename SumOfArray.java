
package calculation;

import java.util.InputMismatchException;
import java.util.Scanner;


public class SumOfArray {

  
    public static void main(String[] args) {
        
        try{
         int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size =s.nextInt();
        int[] N =new int[size];
        if(size!=0){
            
        
        System.out.println("Enter the array elements");
        for(int i=0;i<N.length;i++){
            N[i]=s.nextInt();
        }
        System.out.println("enter how many values to sum");
        int K=s.nextInt();
         System.out.println("Sum");
        for(int i=0;i<K;){
           
            sum=sum+N[i];
            i++;
           
        }
         System.out.println(sum);
       
    }else {
            System.out.println("Dont enter array size as 0");
        }
        }
    
    catch(InputMismatchException e){
        System.out.println("Invalid");
    }
        catch(NegativeArraySizeException e){
            System.out.println("Dont give negative value");
        }
        }
}
