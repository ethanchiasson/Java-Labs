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
public class WageEmployee extends Employee{
    private double wage;
    private double hours;

    public WageEmployee(double wage, double hours, String firstName, String lastName) {
        super(firstName, lastName);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double computePay() {
        return this.hours * this.wage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WageEmployee other = (WageEmployee) obj;
        if (Double.doubleToLongBits(this.wage) != Double.doubleToLongBits(other.wage)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hours) != Double.doubleToLongBits(other.hours)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return "WageEmployee{"+ s + "wage=" + wage + ", hours=" + hours + '}';
    }
    
    
    public static void main(String[] args) {
        WageEmployee e1 = new WageEmployee(20.75, 40, "John", "Green");
        WageEmployee e2 = new WageEmployee(50.75, 35, "Mary", "Brown");
        WageEmployee e3 = new WageEmployee(15.75, 60, "John", "Green");
        
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
