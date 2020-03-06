/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advlab4;

/**
 *
 * @author Ethan
 */
    public class Faculty extends Employee {

        public static void main(String[] args) {
            new Faculty();
        }
        public Faculty() {
            System.out.println("(4) Faculty's no-arg constructor is invoked");
        }
    }
    class Employee extends Person {

        public Employee() {
            this("(2) Invoke Employee’s overloaded constructor", "second parameter");
            System.out.println("(3) Employee's no-arg constructor is invoked");
        }

        public Employee(String s) {
            System.out.println(s);
        }
        
        public Employee (String s, String ss) {
            System.out.println(s + ss);
        }
    }
    class Person {

        public Person() {
            System.out.println("(1) Person's no-arg constructor is invoked");
        }
    }
