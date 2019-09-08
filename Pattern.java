/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import java.util.Scanner;

/**
 *
 * @author Shaon
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i, j, rows;
    System.out.println("Enter number of rows: ");

   Scanner sc = new Scanner (System.in);
        rows = sc.nextInt();
    for(i=1; i<=rows; ++i)
    {
        for(j=1; j<=i; ++j)
        {
            System.out.println("* ");
        }
        System.out.println(" ");
    }
    }
}
    
    
