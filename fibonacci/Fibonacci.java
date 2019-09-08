/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Shaon
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i, n, t1 = 0, t2 = 1, nextTerm;
         System.out.println("Enter a number");
         Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        
           for (i = 1; i <= n; ++i)
    {
  System.out.println("Enter a number"+t1);
  nextTerm = t1+t2;
  t1=t2;
  t2 = nextTerm;
    }
        
        
    }
    
}
