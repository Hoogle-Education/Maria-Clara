package model;

public class Circles {
  
  public static final double PI = 3.14159265;

  public static double calculatePerimeter(double radius) {
    return 2*PI*radius;
  }

  public static double calculateArea(double radius) {
    return PI*radius*radius;
  }
  
}
