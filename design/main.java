/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.util.Scanner;

/**
 *
 * @author Shaon
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        students std = new students();
        std.id=101;
        std.name="Zulkar Nine";
        std.grade='A';
        std.password=123456;
        System.out.println("id is__"+std.id);
         System.out.println("name is__"+std.name);
          System.out.println("grade is__"+std.grade);
           System.out.println("password is__"+std.password);
        
        
           
           
           students std2=new students();
           Scanner sc= new Scanner(System.in);
           System.out.println("Enter total:");
           int i = sc.nextInt();
           int n;
           for(n=1;n<=i;n++){
           
           System.out.println("Enter a id:");
           std2.id = sc.nextInt();
            System.out.println("Enter a name:");
           std2.name = sc.nextLine();
            System.out.println("Enter a grade:");
           std2.grade = sc.next().charAt(0);
            System.out.println("Enter a password:");
           std2.password = sc.nextInt();
    }
         for(n=1;n<=i;n++){
           
           System.out.println("id is__"+std2.id);
         System.out.println("name is__"+std2.name);
          System.out.println("grade is__"+std2.grade);
           System.out.println("password is__"+std2.password);
    }
           
           
    }
      
}
