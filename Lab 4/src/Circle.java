public class Circle extends MyShape {
    int xCoordinate;
    int yCoordinate;
    int radius;


    public Circle(int xCoordinate, int yCoordinate, int radius){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }
    public Circle(String color, Boolean filed, int xCoordinate, int yCoordinate, int radius){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
        this.color = color;
        this.filed = filed;
    }
    public Circle(){
        color = "green";
        filed = true;
        xCoordinate = 1;
        yCoordinate = 2;
        radius = 5;
    }
    public int getXCoordinate(){

        return xCoordinate;
    }
    public int getYCoordinate(){
        return yCoordinate;
    }
    public int getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
    public double getCircumFerence(){
        return 2 * 3.14 * radius;
    }

    public void setYCoordinate(int yCoordinate){
        this.yCoordinate = yCoordinate;
    }
    public void setXCoordinate(int yCoordinate){
        this.yCoordinate = yCoordinate;
    }
    public void setRadius(int Radius){
        this.radius = radius;
    }
    public double getDistanceTo(Circle anotherCircle){
        double result = Math.sqrt(Math.pow(xCoordinate - anotherCircle.getXCoordinate(), 2) + Math.pow(yCoordinate - anotherCircle.getYCoordinate(),2));

        return result;
    }


    @Override
    public String toString() {
        return "Circle{" + "xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + ", radius=" + radius + ", which is subclass of" + super.toString() + '}';
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Circle circle = (Circle) obj;
        return color.equals(circle.getColor()) &&
                filed == circle.isFiled();
    }
    @Override
    public int hashCode() {
        int result = 43;
        if (xCoordinate != 0) {
            result = 73 * result * xCoordinate;
        }
        if (yCoordinate != 0) {
            result = 73 * result * yCoordinate;
        }
        if (radius != 0) {
            result = 73 * result * radius;
        }
        return result;
    }
}