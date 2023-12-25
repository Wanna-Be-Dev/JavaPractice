package shapes.properties;

public  class Rectangle extends Shape{
    public double width;
    public double length;
    public Rectangle(){
        this.length=15;
        this.width=10;
        filled=false;
    }
    public Rectangle(double l,double w){
        this.length=l;
        this.width=w;
        filled=true;
    }
    public Rectangle(double l,double w,String color,boolean f){
        this.color=color;
        this.length=l;
        this.width=w;
        filled=f;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return width*2+length*2;
    }

    @Override
    public String toString() {
        return "Length is: "+this.length+", width: "+this.width+" and perimeter is "+this.getPerimeter()+"and square is"+this.getArea();
    }
}
