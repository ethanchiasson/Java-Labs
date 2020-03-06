/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advlab4v2;

/**
 *
 * @author Ethan
 */
//will be red on creation of "extends". click bulb and add absctract methods
public class SalaryEmployee extends Employee {

    double salary;

// before using insert code to get this, I went back to Employeee.java
    public SalaryEmployee(double salary, String firstName, String lastName) {
// generates super for us :)
//        This next line calls employeee
        super(firstName, lastName);
        this.salary = salary;
    }

    /**
     * Get the value of salary
     *
     * @return the value of salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Set the value of salary
     *
     * @param salary new value of salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double computePay() {
        return this.salary / 12;
    }

//    inserted to string
    @Override
    public String toString() {
// This next line calls to string of employee ( first and last name )
// Super calls a method from a super class
        String s = super.toString();
//Returns the name from super.substring and the employee salary
        return s + "\n" + "SalaryEmployee{" + "salary=" + salary + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final SalaryEmployee other = (SalaryEmployee) obj;
        
        if (super.equals(other) == false) {
            return false;
        }
        
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        SalaryEmployee e1 = new SalaryEmployee( 50000, "John", "Green");
        SalaryEmployee e2 = new SalaryEmployee( 70000, "Mary", "Brown");
        SalaryEmployee e3 = new SalaryEmployee( 100000, "John", "Green");
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e2);
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e1));
        System.out.println(e1.computePay());
        System.out.println(e1.equals( new Object ()));
    }

}
