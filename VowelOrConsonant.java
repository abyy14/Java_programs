/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import java.util.Scanner;

/**
 *
 * @author Sarala
 */
public class VowelOrConsonant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          
        
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=s.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Vowel");
        }else if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println("Consonant");
        }
                else{
            System.out.println("Invalid");
    }
        
    

        
}
}
