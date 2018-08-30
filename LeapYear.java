

package calculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {
       
        try{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=s.nextInt();
        if(!(Integer.toString(year).length()==4)){
            System.out.println("Invalid");
        }
        else if(year%4==0){
            System.out.println(year +" is Leap year");
        } else{
            System.out.println("Its not leap year");
        }
        }
        catch(InputMismatchException e){
            System.out.println("Enter valid input");
        }
    }
    
}
