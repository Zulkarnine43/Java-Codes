/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcm.calculation.by.finding.gcd;

import java.util.Scanner;

/**
 *
 * @author Shaon
 */
public class LCMCalculationByFindingGCD {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1,n2,i,gcd,lcm;
        System .out.println("Enter two integer number:");
        Scanner sc = new Scanner(System.in);
        
        n1 = sc.nextInt();
        sc.next();
        n2= sc.nextInt();
        
        for(i=1; i<=n1 && i<=2;i++){
            if(n1%i==0 && n2%i==0)
                gcd =i ;
            
        }
      lcm=(n1*n2)/gcd;
        System.out.println("The LCM OF TWO NUMBER"+n1 +n2 + lcm);
        
        
        
        
        // TODO code application logic here
    }
    
}
