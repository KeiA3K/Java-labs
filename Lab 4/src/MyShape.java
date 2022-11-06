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
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        MyShape myShape = (MyShape) obj;
        return color.equals(myShape.getColor()) &&
                filed == myShape.isFiled();
    }
    @Override
    public int hashCode(){
        int result = 17;
        if (color != null){
            result = 31 * result + color.hashCode();
        }
        if (filed){
            result = 37 * result;
        }
        return result;
    }
}