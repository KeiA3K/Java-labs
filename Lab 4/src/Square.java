public class Square extends Rectangle{
    int sideLength;
    public Square(int x1Coordinate, int y1Coordinate, int sideLength){
        super(x1Coordinate, x1Coordinate + sideLength, y1Coordinate, y1Coordinate - sideLength);
        int x1Coordinate1 = x1Coordinate;
        int x2Coordinate = getX2Coordinate();
    }
    public Square(String color, Boolean filed,int x1Coordinate, int y1Coordinate, int sideLength){
        this.color = color;
        this.filed = filed;
        this.x1Coordinate = x1Coordinate;
        this.y1Coordinate = y1Coordinate;
    }
    public Square(){
        color = "blue";
        filed = false;
        x1Coordinate = 0;
        y1Coordinate = 0;
    }
    public int getLength(){
        return (y1Coordinate + x1Coordinate);
    }

    public int getArea(){
        return (int) Math.pow(getLength(), 2);
    }
    public void setArea(int sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x1Coordinate=" + x1Coordinate +
                ", x2Coordinate=" + x2Coordinate +
                ", y1Coordinate=" + y1Coordinate +
                ", y2Coordinate=" + y2Coordinate +
                ", color='" + color + '\'' +
                ", filed=" + filed +
                ", which is subclass of" + super.toString() +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Square square = (Square) obj;
        return color.equals(square.getColor()) &&
                filed == square.isFiled();
    }
}
