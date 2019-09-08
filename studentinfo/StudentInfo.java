/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinfo;

/**
 *
 * @author Shaon
 */
public class StudentInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        student std = new student();
        std.studentInfo();
        std.registrationInfo();
        std.subInfo();
        std.attendenceInfo();
        std.ExamInfo();
        
    }
    
}
