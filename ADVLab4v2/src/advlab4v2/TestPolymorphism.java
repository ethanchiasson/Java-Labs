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
// poly = multiple morphism = shape
// polymorpjism allows us to bidn to the correct method at run time
// Also allows us to assign sub to supers
public class TestPolymorphism {

    public static void printPay(Employee e) {
        System.out.println(e.computePay());
    }

    public static void printPay(Employee[] ar) {
        for (Employee e : ar) {
            System.out.println(e.computePay());
        }
    }
//    over for arrayList

    public static void printPay(ArrayList<Employee> ar) {
        for (Employee e : ar) {
            System.out.println(e.computePay());
        }
    }

    public static void main(String[] args) {
// polymorphism = assigning sub to a super
        Employee e1 = new WageEmployee(8.75, 40, "John", "White");
// Standard
        SalaryEmployee e2 = new SalaryEmployee(40000, "John", "White");
//This wont work unless we type cast
// e2 = e1;
// Typed Casted will work, but is not reccomended. It will crash if 
// e2 = (SalaryEmployee) e1;
// System.out.println(e2);
        printPay(e1);
        printPay(e2);

        Employee[] arEmployee = new Employee[2];
        arEmployee[0] = new WageEmployee(55.55, 40, "Mary", "Poppins");
        arEmployee[1] = new SalaryEmployee(100000, "Al", "Pochino");

        printPay(arEmployee);

// ArrayList
        ArrayList<Employee> listEmployee = new ArrayList();
        listEmployee.add(arEmployee[0]);
        listEmployee.add(new SalaryEmployee(200000, "Robert", "DeNiro"));

        printPay(listEmployee);
        
        Employee e3 = new WageEmployee (8,10, "joe", "white");
        System.out.println(e3);
    }  
}

class A {
        int x = 10;
        protected void p (int x) {}
    }
    class B extends A {
        @Override
        public void p (int x) {}
        
        public static void main(String[] args) {
            A a1 = new A();
            A a2 = new A();
            
            System.out.println(a1.equals(a2));
            System.out.println(a1.equals(a1));
        }
    }