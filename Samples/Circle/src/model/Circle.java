package model;

public class Circle {
  
  public static final double PI = 3.14159265;
  private double radius;
  
  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double perimeter() {
    return 2*PI*radius;
  }

  public double area() {
    return PI*radius*radius;
  }

}
