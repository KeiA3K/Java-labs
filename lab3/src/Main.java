import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Введите данные первой окружности: ");
        Scanner scanner = new Scanner(System.in);
//        int xCoordinate = scanner.nextInt();
//        int yCoordinate = scanner.nextInt();
//        int radius = scanner.nextInt();
//
//        Circle myCircle = new Circle(xCoordinate, yCoordinate, radius);
//        System.out.println(myCircle);
//
//        System.out.println("Площадь: "+ myCircle.getArea());
//        System.out.println("Длина окружности: "+ myCircle.getCircumFerence());
//        System.out.println("Введите данные второй окружности: ");
//
//        int secondxCoordinate = scanner.nextInt();
//        int secondyCoordinate = scanner.nextInt();
//        int secondRadius = scanner.nextInt();
//
//        Circle secondCircle = new Circle(secondxCoordinate, secondyCoordinate, secondRadius);
//        System.out.println("Расстояние между двумя окружностями: " + myCircle.getDistanceTo(secondCircle));

        int x1Coordinate = scanner.nextInt();
        int x2Coordinate = scanner.nextInt();
        int y1Coordinate = scanner.nextInt();
        int y2Coordinate = scanner.nextInt();

       int secondx1Coordinate = scanner.nextInt();
       int secondx2Coordinate = scanner.nextInt();
       int secondy1Coordinate = scanner.nextInt();
       int secondy2Coordinate = scanner.nextInt();

       Rectangle myRectangle = new Rectangle(x1Coordinate, x2Coordinate, y1Coordinate, y2Coordinate);
//        System.out.println(myRectangle);
       System.out.println("Area: " + myRectangle.getArea());
       System.out.println("CircumFerence: " + myRectangle.getCircumFerence());

       Rectangle secondRectangle = new Rectangle(secondx1Coordinate, secondx2Coordinate, secondy1Coordinate, secondy2Coordinate);
//        System.out.println(anotherRectangle);
       System.out.println("Area " + secondRectangle.getArea());
       System.out.println("Perimeter " + secondRectangle.getCircumFerence());
       System.out.println("Distance: " + secondRectangle.getRecDistanceTo(secondRectangle));

//        Square mySquare = new Square(x1Coordinate, y1Coordinate, y1Coordinate + x1Coordinate);
//        System.out.println(mySquare);
//        System.out.println("Area: " + mySquare.getArea());
//        System.out.println("Perimeter: " + mySquare.getCircumFerence());
//        System.out.println("Color: " + mySquare.getColor());
//        System.out.println("Filed: " + mySquare.isFiled());
    }
}