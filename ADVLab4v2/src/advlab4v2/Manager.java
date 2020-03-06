/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advlab4v2;

import java.util.ArrayList;

/**
 *
 * @author Ethan
 */
public class Manager extends SalaryEmployee {

    
    // Creating generic integer ArrayList
    ArrayList<Employee> otherEmployees = new ArrayList<Employee>();
    
    public Manager(double salary, String firstName, String lastName) {
        super(salary, firstName, lastName);
    }

    @Override
    public double computePay() {
        return salary * 2;
    }
      
    public boolean addToGroup(Employee e){
        return this.otherEmployees.add(e);
    }
    
    public boolean removeFromGroup(Employee e){
        return this.otherEmployees.remove(e);
    }
    
//    public String sortByName (Employee e) {
//        
//    }
}
