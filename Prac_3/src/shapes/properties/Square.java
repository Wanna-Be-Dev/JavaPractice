package shapes.properties;

public class Square extends Rectangle{
    public double side;
    public Square(){
        this.side=20;
        filled=false;
    }
    public Square(double s){
        this.side=s;
        filled=true;
    }
    public Square(double s,boolean f){
        this.side=s;
        filled=f;
    }
    public double getLength() {
        return this.side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side*side;
    }

    @Override
    double getPerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Side is: "+this.side+" and perimeter is "+this.getPerimeter()+"and square is"+this.getArea();
    }
}

