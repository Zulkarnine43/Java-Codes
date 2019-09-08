/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.Scanner;

/**
 *
 * @author Shaon
 */
public class Leapyear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int year;
        Scanner sc = new Scanner (System.in);
        year = sc.nextInt();
       // sc.next();
        
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("leap year"+year);
                }
                    else{
                            System.out.println(" not leap year"+year);
                            }
                
                
            }
            else{
                System.out.println("leap year"+year);
            }
            System.out.println(" not leap year"+year);
        }
        
    }
    
}
