/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advlab5;

/**
 *
 * @author Ethan
 */
public class TestGeometricObject {
//    Here we are passing The super class "GeometricObject" and a varibale "o" to a method...
//    ... which is called in the main and used to display the area and perimeter of a specific Circle/Rect
    public static void displayGeometricObject(GeometricObject o) {
        System.out.println();
        System.out.println("The area is " + o.getArea());
        System.out.println("The perimeter is " + o.getPerimeter());
    }
// Main
    public static void main(String[] args) {
        // Here we apply the sub to the super ( circle / rect to the Object )
        // Geometric object cant have " new geometricObject" because you must call it indirectly
        // Via the subclass
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);
        GeometricObject geoObject3 = new Rectangle(9, 4);

        // Here we call the displayGeometricObject method, which takes a parameter...
        // The parameter that neeeds to be passed is the new Circles and Rectangles we made
        // Calling this method will take in the Param "geoObject1"...
        // ... Which uses "o" to find use the correct absctract override methods "getArea"/"GetPermiter"
        // Creating the "o" allows us to pass "geoObject1"s into the parameter....
        displayGeometricObject(geoObject1);
        displayGeometricObject(geoObject2);
        displayGeometricObject(geoObject3);

        System.out.println("The two objects have the same area? "
                + equalArea(geoObject1, geoObject2, geoObject3));
    }
//    
//
//
//
//
//
//

    /**
     * A method for comparing the areas of two geometric objects
     */
//    Here we pass in the new circle and rect objacts we made above to see if they are the same
//    True or false response
    public static boolean equalArea(GeometricObject object1,
            GeometricObject object2, GeometricObject object3) {
        return object1.getArea() == object2.getArea();
    }

}
