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
//
// When we put an abstract method in a class, you must make the class absctract
//
// When a class is abstract, we cant say new GeometricObject ( aka abstanseate )... 
// ... so we have to say "new Rectangle"
// contructors of superclasses are not inherited. They are invoked explicity or implicity
// If we dont call the construtor ourselves, the no arg constructor will be called
// We can call the one we want ( super ), but if we dont, no arg will be called.

// Super class constructors are not inherited, but can be called using "super", but if not...
// ... the no arg will be used.

// Every class is dirved from something...
// remeber how we override to string and equals and such? They are from the object.
// We dont we dont override, we use the objects ( so the dedault .toString ).

// The super keyword can also be used with "super." to call methods of the super class
// *Caution*, we must use "super" to call the superclass contrcutor. Unvoking a SpClass Con. 's name in a subclass...
// ... causes a syntax error

// SUPER MUST BE PUT AT THE BEGINING OF A LINE.

abstract public class GeometricObject {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * Construct a default geometric object
     */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with color and filled value
     */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * Return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set a new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return filled. Since filled is boolean, the get method is named isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Set a new filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Get dateCreated
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color
                + " and filled: " + filled;
    }

    /**
     * Abstract method getArea
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter
     */
    public abstract double getPerimeter();
}
