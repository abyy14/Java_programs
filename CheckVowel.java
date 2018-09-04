
package calculation;

import java.util.InputMismatchException;
import java.util.Scanner;


public class CheckVowel {

  
    public static void main(String[] args) {
                int count=0;
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                System.out.println("yes");
                break;
            }
            else{
              count++;
            }
            
            
            
        }
        if(count!=0){
            System.out.println("No");
        }
        
    }
        
}
