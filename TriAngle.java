
package executionsteps;

import java.util.Scanner;


public class TriAngle {
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    double base,height,area;
        System.out.print("Enter the value of base:");
    base = input.nextDouble();
        System.out.print("Emter the value of height:");
    height = input.nextDouble();
    area = 0.5 * base * height;
        System.out.println("area of triangle:"+area );
    
    }
}
