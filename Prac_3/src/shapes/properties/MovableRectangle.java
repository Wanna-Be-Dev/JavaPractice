package shapes.properties;

public class MovableRectangle implements Movable{
    MovablePoint topLeft;
    MovablePoint  bottomRight;
    MovableRectangle(int x1,int x2,int y1,int y2,int xSpeed,int ySpeed){
        topLeft.x=x1;
        bottomRight.x=x2;
        topLeft.y=y1;
        bottomRight.y=y2;
        topLeft.xSpeed=xSpeed;
        bottomRight.xSpeed=xSpeed;
        topLeft.ySpeed=ySpeed;
        bottomRight.ySpeed=ySpeed;
    }
    @Override
    public void moveUp() {
        topLeft.y= topLeft.y+ topLeft.ySpeed;
        bottomRight.y=bottomRight.y+bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y= topLeft.y- topLeft.ySpeed;
        bottomRight.y=bottomRight.y-bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x= topLeft.x- topLeft.xSpeed;
        bottomRight.x= bottomRight.x- bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x= topLeft.x+ topLeft.xSpeed;
        bottomRight.x= bottomRight.x+ bottomRight.xSpeed;
    }
}
