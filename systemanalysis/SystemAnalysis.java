/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemanalysis;

/**
 *
 * @author Shaon
 */
public class SystemAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        students  student=new students();
        student.id= 163432601;
        student.name="Zulkar Nine";
        student.subject="B.sc. in CSE";
        student.course = "System Analysis";
        student.result= "A+";
        student.register();
        student.course();
        student.names= "Sakib HasAN";
       // student.exam(student.name, student.result,student.course);
        
                System.out.println("Name is:::"+student.id);
             System.out.println("Name is:::"+student.names);

       // System.out.println("Name is:::"+student.register(student.name, student.result));
        
    }
    
}
