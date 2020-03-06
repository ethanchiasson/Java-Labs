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
class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    
    public Triangle() {}
    
    public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
//   public double getArea(double area, double resArea) {
//       area = (side1+side2+side3)/2.0d;
//       resArea = Math.sqrt(area* (area - side1) * (area - side2) * (area - side3));
//       return resArea;
//   } 
//   
//   public double getPerimeter(double perimeter) {
//       return perimeter = (side1+side2+side3);
//   } 

    @Override
    public String toString() {
        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + '}';
    }
    
    public static void main(String[] args) {
        Triangle triangle = new Triangle (1, 1.5, 1);
    }


    @Override
    public double getArea() {
        double area = (side1+side2+side3)/2.0d;
       double resArea = Math.sqrt(area* (area - side1) * (area - side2) * (area - side3));
       return resArea;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (side1+side2+side3);
       return perimeter;
    }
}
