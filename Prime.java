
package prime;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Prime {

    public static void main(String[] args) {
     
        try{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=(int)s.nextDouble();
        double[] arr=new double[size];//=new double[size];
        
        System.out.println("Enter the elements");
       for(int i=0;i<arr.length;i++){
           arr[i]=s.nextInt();
       }
    
        double su=arr[0]+arr[size-1];
        double sum=((size/2)*su);
        
        System.out.println("Sum of arithmetic progression: "+su);
        

        }
        catch(InputMismatchException e){
            System.out.println("Enter correct input");
        }
    }
}
