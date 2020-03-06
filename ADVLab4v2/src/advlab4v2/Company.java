/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advlab4v2;

import java.util.ArrayList;

/**
 *
 * @author Ethvate
 */
public class Company {
    
//    must have "new array... " to make sure its not null
    private ArrayList<Employee> employee = new ArrayList<Employee>();

    /**
     * Get the value of employee
     *
     * @return the value of employee
     */
    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    /**
     * Set the value of employee
     *
     * @param employee new value of employee
     */
    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }
 
    public void addEmployee(Employee e) {
    employee.add(e);
    }
/** 
 * 
 * 
 * @param e the employee to remove
 * @return the remove employee
 */
    public Employee removeEmployee (Employee e) {
        int index = employee.indexOf(e);
        if (index == -1 ) {
            return null;
        }
       Employee eToremove = employee.get(index);
       employee.remove(index);
       return eToremove;
//        if (employee.contains(e)) {}
//        employee.remove(e);
    }

    @Override
    public String toString() {
        return "Company{" + "employee=" + employee + '}';
    }
    
    
    public static void main(String[] args) {
        Company c = new Company();
        Employee e1 = new WageEmployee(8.75, 40, "John", "White");
        SalaryEmployee e2 = new SalaryEmployee(40000, "John", "White");
        
        c.addEmployee(e1);
        System.out.println("");
        c.addEmployee(e2);
        System.out.println(c);
        System.out.println("");
        System.out.println(c.removeEmployee(e1));
        System.out.println( c.removeEmployee(new WageEmployee(8.75, 40, "Paul", "White")));
    }
}
