/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Shaon
 */
public class Constructor {

  
     public   int id;
     public   String name;
     public   double salary;
        
    public void getId(int id){
        System.out.println("Id :"+id);
    }
     public void getName(String name){
        System.out.println("name :"+name);
    }
      public void getSalary(double salary){
         System.out.println("salary :"+salary);
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
    
    
     
    

  Constructor sc =  new Constructor();
  sc.getId(163432601);
  sc.getName("Zulkar nine");
  sc.getSalary(12355);
}
}