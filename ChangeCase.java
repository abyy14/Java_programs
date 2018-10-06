// Java program to Convert characters  
// of a string to opposite case

import java.util.*;
import java.lang.*;
import java.io.*;
 
class uppe_lower{ 
     
     static void convertOpposite(StringBuffer str) 
     { 
        int ln = str.length(); 
             
        for (int i=0; i<ln; i++) 
        { 
            Character c = str.charAt(i); 
            if (Character.isLowerCase(c)) 
                str.replace(i, i+1, Character.toUpperCase(c)+""); 
            else
                str.replace(i, i+1, Character.toLowerCase(c)+""); 
             
        } 
      

     }

    
    public static void main(String[] args) {
     
        Scanner s=new Scanner(System.in);
        StringBuffer str = new StringBuffer();
        str.append(s.nextLine());
         // Calling the Method 
         convertOpposite(str); 
           
         System.out.println(str); 
        }
}
 

