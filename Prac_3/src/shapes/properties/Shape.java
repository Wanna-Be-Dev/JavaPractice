package shapes.properties;

abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        this.filled = false;
        this.color = "blue";
    }
    public Shape(String c,boolean f){
        color=c;
        filled=f;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled() {
        return filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();
    public abstract double getLength();

}
