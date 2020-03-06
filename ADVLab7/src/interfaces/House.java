/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Date;

/**
 *
 * @author Ethan
 */
public class House implements Cloneable, Comparable<House>{
  private int id;
  private double area;
  private java.util.Date whenBuilt;
  
  public House(int id, double area) {
    this.id = id;
    this.area = area;
    whenBuilt = new java.util.Date();
  }
  
  public int getId() {
    return id;
  }
  
  public double getArea() {
    return area;
  }

  public java.util.Date getWhenBuilt() {
    return whenBuilt;
  }

  @Override /** Override the protected clone method defined in 
    the Object class, and strengthen its accessibility */
  public Object clone() throws CloneNotSupportedException {
//    return super.clone();
      
      House house = null;
      try
      { 
          house = (House) super.clone();
          
          house.whenBuilt = (Date) this.whenBuilt.clone();
      }
      catch (CloneNotSupportedException e)
      {
          System.err.println(e.getMessage());
      }
      return house;
  }
  

    @Override
    public String toString() {
        return "house{" + "id=" + id + " , area=" + area + ", whenBuilt= " + whenBuilt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return true;
        if(getClass() != o.getClass()) return false;
        final House other = (House) o;
        if (this.id == other.id)
        {
            return false;
        }
        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area))
        {
            return false;
        }
        if (! this.whenBuilt.equals(other.whenBuilt)) 
        {
            return false;
        }
        return true;
    }
  
    
  
  
    public static void main(String[] args) throws CloneNotSupportedException {
        House h1 = new House (1,1000);
        House h2 = (House) h1.clone();
        House h3 = new House (3, 2000);
        House h4 = new House (4, 2000);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println("house 1 house and 2 are indentile " + h1.compareTo(h2));
        System.out.println("house 3 house and 4 have the same area " + h3.compareTo(h4));
        System.out.println("house 4 is large than house 2 " + h4.compareTo(h2));
        
        System.out.println("house 1 and house 2 are equal " + h1.equals(h2));
        System.out.println("house 2 and house 3 are equals " + h2.equals(h3));
    }

    @Override
    public int compareTo(House t) {
        if (this.getId() == t.getId() && 
                this.getArea() == t.getArea() &&
                this.getWhenBuilt().equals(t.getWhenBuilt()))
        return 0;
        
        if (this.area > t.area )
            return 1;
        else if (this.area < t.area )
            return -1;
        else
            return -2;
    }
    
}

