public class MyShape {
    String color;
    Boolean filed;
    public MyShape(String color, Boolean filed) {
        this.color = color;
        this.filed = filed;
    }
    public MyShape(){
        color = "red";
        filed = true;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Boolean isFiled() {
        return filed;
    }
    public void setFiled(Boolean filed) {
        this.filed = filed;
    }
    @Override
    public String toString() {
        return "MyShape{" +
                "color='" + color + '\'' +
                ", filed=" + filed +
                '}';
    }
}


