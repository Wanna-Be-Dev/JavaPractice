package shapes.properties;

public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;
    public MovableCircle(  int x,  int y,  int xSpeed,  int ySpeed,int radius){
        this.radius=radius;
        center.x =x;
        center.y =y;
        center.xSpeed=xSpeed;
        center.ySpeed=ySpeed;
    }
    @Override
    public void moveUp() {
        center.y=center.y+center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y=center.y-center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x=center.x-center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x=center.x+center.xSpeed;
    }
    public String toString() {
        return "X is" +center.x+" and Y is" +center.y+" and Xspeed is" +center.xSpeed+" and Yspeed is" +center.ySpeed+" with radius"+this.radius;
    }
}
