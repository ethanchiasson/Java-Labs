/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advlab4;

import java.util.ArrayList;

/**
 *
 * @author Ethan
 */
public class TestCircleAndRectangle {
     public static void main(String[] args) {
         
    
    Circle circle = new Circle(1);
    
//     Goes into Circle.java and uses to this. to use circle.toString
    System.out.println("A circle " + circle.toString());
    System.out.println("The color is " + circle.getColor());
    System.out.println("The radius is " + circle.getRadius());
    System.out.println("The area is " + circle.getArea());
    System.out.println("The diameter is " + circle.getDiameter());
    
    Rectangle rectangle = new Rectangle(2, 4);
    System.out.println("\nA rectangle " + rectangle.toString());
    System.out.println("The area is " + rectangle.getArea());
    System.out.println("The perimeter is " + 
      rectangle.getPerimeter());
    
    ArrayList listOfGeoObject = new ArrayList();
    listOfGeoObject.add(circle);
    listOfGeoObject.add(rectangle);
    for ( Object O : listOfGeoObject)
        System.out.println(O);
  }
}
