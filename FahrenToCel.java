
package executionsteps;

import java.util.Scanner;


public class FahrenToCel {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double f,c;
    
        System.out.println("Celcius=:");
        c = input.nextFloat();
        
         f = 1.8 * c + 32;
    System.out.println("f");
    
    
    }
}
