/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabet.or.not;

import java.util.Scanner;

/**
 *
 * @author Shaon
 */
public class AlphabetOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
         String c;
  Scanner sc = new Scanner (System.in);
        c = sc.nextLine();
    if( (c>='a' && c<='z') || (c>='A' && c<='Z'))
       System.out.println("is an alphabet."+c);
    else
       System.out.println("is  not an alphabet."+c);
    }
    
}
