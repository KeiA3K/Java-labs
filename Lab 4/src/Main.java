import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<MyShape, String> myHashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int x1Coordinate = scanner.nextInt();
        int x2Coordinate = scanner.nextInt();
        int y1Coordinate = scanner.nextInt();
        int y2Coordinate = scanner.nextInt();

        int xCoordinate = scanner.nextInt();
        int yCoordinate = scanner.nextInt();
        int radius = scanner.nextInt();

        int sideLength = scanner.nextInt();

        Circle myCircle = new Circle(xCoordinate, yCoordinate, radius);
        Rectangle myRectangle = new Rectangle(x1Coordinate, x2Coordinate, y1Coordinate, y2Coordinate);
        Square mySquare = new Square(x1Coordinate, y1Coordinate, y1Coordinate + x1Coordinate);

        myHashMap.put(myCircle, "CIRCLES");
        myHashMap.put(myRectangle, "RECTANGLES");
        myHashMap.put(mySquare, "SQUARE");

        System.out.println("INITIAL - " + myHashMap.size() + " " + myHashMap.get(myCircle));
        Circle circleWithSameAttributes = new Circle( xCoordinate, yCoordinate, radius);
        myHashMap.put(circleWithSameAttributes, "SAME CIRCLES");
        System.out.println("ADDED CIRCLE WITH SAME ATTRIBUTES - " + myHashMap.size() + " " + myHashMap.get(myCircle));
    }
}
