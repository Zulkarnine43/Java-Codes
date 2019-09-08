/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generate.multiple.table;

import java.util.Scanner;

/**
 *
 * @author Shaon
 */
public class GenerateMultipleTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n, i;
      System.out.println("Enter a number");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        //sc.next();
        for(i=1; i<=10; ++i){
            int mul = n*i;
            System.out.println("result"+n+i+mul);
        }
        
        
        
    }
    
}
