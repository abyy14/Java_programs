
package calculation;

import java.util.Scanner;
import java.lang.Math;

public class Power {

 
    public static void main(String[] args) {
       
        
        Scanner s=new Scanner(System.in);
        int base=s.nextInt();
        int power=s.nextInt();
        System.out.println(Math.pow(base, power));
       
    }
    
}
