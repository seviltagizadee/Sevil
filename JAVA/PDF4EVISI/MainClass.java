package PDF4EVISI;


class Circle{
    double radius;
    double length;
}

class Calculator{
     public void calculateCircleLength(Circle circle){
         circle.length = 2 * 3.14 * circle.radius;
     }

}
public class MainClass {
    public static void main(String[] args) {
      Circle circle = new Circle();
      circle.radius = 2.0;
      Calculator calculator = new Calculator();
      calculator.calculateCircleLength(circle);
        System.out.println("Length of circle : " +circle.length);
    }
}

