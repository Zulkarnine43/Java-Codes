/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest.number.of.three.number;

import java.util.Scanner;

/**
 *
 * @author Shaon
 */
public class LargestNumberOfThreeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int n1,n2,n3;
        System.out.println("Enter three number");
        Scanner sc = new Scanner (System.in);
        n1 = sc.nextInt();
        sc.next();
        n2 = sc.nextInt();
        sc.next();
        n3 = sc.nextInt();
        sc.next();
        
            if( n1>=n2 && n1>=n3 )
        System.out.println(" is the largest number."+n1);
    if( n2>=n1 && n2>=n3 )
       System.out.println(" is the largest number."+n2);
        
    if( n3>=n1 && n3>=n2 )
       System.out.println(" is the largest number."+n3);
    
   // return 0;
        
        
        
        
        
    }
    
}
