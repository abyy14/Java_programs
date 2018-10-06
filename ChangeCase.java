
import java.util.*;
import java.lang.*;
import java.io.*;

public class uppe_lower {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        	Scanner s=new Scanner(System.in);
		String str=s.next();
                char[] arr=str.toCharArray();
                for(int i=0;i<=arr.length-1;i++){
                    
                       if (Character.isUpperCase(arr[i])){
                          arr[i]=Character.toLowerCase(arr[i]);
                       }
                       else {
                        arr[i]=   Character.toUpperCase(arr[i]);
                       }
                       System.out.print(arr[i]);
		}
                 }
}    

