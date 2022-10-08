import model.Circle;
import model.Circles;

public class App {
    public static void main(String[] args) {
      
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(5);

        System.out.println(Circle.PI);
        System.out.println(c1.perimeter());
        System.out.println(Circles.calculatePerimeter(10));
       
    }

}
