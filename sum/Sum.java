/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

import java.util.Scanner;

/**
 *
 * @author Shaon
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1,num2,sum;
        Scanner sc = new Scanner (System.in);
        num1 = sc.nextInt();
                num2 = sc.nextInt();
                
                sum= num1+num2;
                
                
                System.out.println("Sum is "+sum);

        
    }
    
}
