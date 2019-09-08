/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getset;

/**
 *
 * @author Shaon
 */
public class employee {
    public int id;
    public String name;
    public double salary;
    
    
    public void setId(){
       id=this.getId(163432601);
        System.out.println("Id is:"+id);
    }
     public void setName(){
         name = this.getName("Zulkar Nine");
                System.out.println("Name is:"+this.name);
    }
      public void setSalary(){
          salary = this.getSalary(20600);
                System.out.println("Salary is:"+this.salary);
    }   
      public int getId(int id){
        return this.id;
    }
        public String getName(String Name){
        return this.name;
    }
          public double getSalary(double salary){
        return this.salary;
    }
    
}
