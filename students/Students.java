/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

import java.util.Scanner;

/**
 *
 * @author Shaon
 */
public class Students {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        test t=new test();
               
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter student id");
        t.id=sc.nextInt();
        
        System.out.println("Enter student name");
        t.name=sc.nextLine();
        sc.next();
        
       // System.out.println("Enter student attendence");
        //t.attendence=sc.nextInt();
      
        System.out.println("Enter student subject");
        t.subject=sc.nextLine();
        sc.next();
        
        System.out.println("Enter student GPA");
        t.GPA = sc.nextLine();
        sc.next();
        
        
        t.register(t.name, t.GPA, t.subject);
        
        
       
         System.out.println("Student_id_______"+t.id);
         System.out.println("Student_name_____"+t.name);
                  System.out.println("Student_name_____"+t.subject);
                           System.out.println("Student_name_____"+t.attendence);

                           System.out.println("Student_name_____"+t.GPA);

        
    }
    
}
