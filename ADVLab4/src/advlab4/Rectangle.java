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
// We say "extends" to say that it is a subclass of the Geometric "Superclass"
//
// Base =  Superclass , derived = Subclass !!
// Super / sub standard in java

public class Rectangle extends GeometricObject {
    private double width;
  private double height;

  public Rectangle() {
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  @Override /** Return area */
  public double getArea() {
    return width * height;
  }

  @Override /** Return perimeter of Rectangle*/
  public double getPerimeter() {
    return 2 * (width + height);
  }
}
