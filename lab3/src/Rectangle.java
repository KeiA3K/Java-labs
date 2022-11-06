public class Rectangle {
    public int x1Coordinate, x2Coordinate, y1Coordinate, y2Coordinate;

    public Rectangle(int x1Coordinate, int x2Coordinate, int y1Coordinate, int y2Coordinate) {
        this.x1Coordinate = x1Coordinate;
        this.x2Coordinate = x2Coordinate;
        this.y1Coordinate = y1Coordinate;
        this.y2Coordinate = y2Coordinate;

    }
    public int getX1Coordinate() {
        return x1Coordinate;
    }

    public void setX1Coordinate(int x1Coordinate) {
        this.x1Coordinate = x1Coordinate;
    }

    public int getX2Coordinate() {
        return x2Coordinate;
    }

    public void setX2Coordinate(int x2Coordinate) {
        this.x2Coordinate = x2Coordinate;
    }

    public int getY1Coordinate() {
        return y1Coordinate;
    }

    public void setY1Coordinate(int y1Coordinate) {
        this.y1Coordinate = y1Coordinate;
    }

    public int getY2Coordinate() {
        return y2Coordinate;
    }

    public void setY2Coordinate(int y2Coordinate) {
        this.y2Coordinate = y2Coordinate;
    }

    public int getsideLength(){
        return x2Coordinate - x1Coordinate;
    }
    public int getSecsideLength(){
        return y1Coordinate - y2Coordinate;
    }
    public int xCenter(){
        return (x1Coordinate + x2Coordinate) / 2;
    }
    public int yCenter(){
        return (y1Coordinate + y2Coordinate) / 2;
    }

    public int getArea(){
        return (getSecsideLength() * getsideLength());
    }
    public int getCircumFerence(){
        return (getsideLength() + getSecsideLength()) * 2;
    }
    public double getRecDistanceTo(Rectangle secondRectangle){
        return Math.sqrt(Math.pow(xCenter() - secondRectangle.xCenter(), 2) + Math.pow(yCenter() - secondRectangle.yCenter(), 2));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x1Coordinate=" + x1Coordinate +
                ", x2Coordinate=" + x2Coordinate +
                ", y1Coordinate=" + y1Coordinate +
                ", y2Coordinate=" + y2Coordinate +
                '}';
    }


}