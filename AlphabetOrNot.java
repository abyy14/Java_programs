
package calculation;

import java.util.Scanner;


public class AlphabetOrNot {

 
    public static void main(String[] args) {
      
        Scanner s=new Scanner(System.in);
       System.out.println("Enter the letter");
        char ch=s.next().charAt(0);
        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
            System.out.println("Alphabet");
        }else {
            System.out.println("No");
        }
       
        
    }
    
}
