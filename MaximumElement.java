
package prime;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MaximumElement {
    public static void main(String[] args){
        try{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=(int)s.nextDouble();
        double[] arr=new double[size];
       System.out.println("Enter the array elements: ");
       for(int i=0;i<arr.length;i++){
           arr[i]=s.nextDouble();
           
       }
       for(int i=0;i<arr.length-1;i++){
           for(int j=1;j<arr.length;j++){
               if(arr[j]>arr[i]){
                   double temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
          
       }
       System.out.println("Maximum element");
        System.out.println(arr[0]);
    }
    
    catch(InputMismatchException e){
    System.out.println("Enter correct input");
}
}
}
