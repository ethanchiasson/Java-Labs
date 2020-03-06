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
public class CircleWithException {

    /**
     * The radius of the circle
     */
    private double radius;

    /**
     * The number of the objects created
     */
    private static int numberOfObjects = 0;

    /**
     * Construct a circle with radius 1
     */
    public CircleWithException() {
        this(1.0);
    }

    /**
     * Construct a circle with a specified radius
     */
    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double newRadius) //            Thows keyword required after method header
    //            throws IllegalArgumentException 
    {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new IllegalArgumentException(
                    "Radius cannot be negative");
        }
    }

    /**
     * Return numberOfObjects
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Return the area of this circle
     */
    public double findArea() {
        return radius * radius * 3.14159;
    }

    public static void main(String[] args) {
        CircleWithException c1 = new CircleWithException(2);
        CircleWithException c2 = new CircleWithException(3);
//        getNumberOfObjects is a static method
//        System.out.println(CircleWithException.getNumberOfObjects());
//        Throws Exception, but does not give a compiling error

        try {
            c2.setRadius(-1);
            System.out.println(CircleWithException.getNumberOfObjects());
        } catch (IllegalArgumentException e) {
            System.out.println("PLease enter a radius > 0");
        }
    }
}
