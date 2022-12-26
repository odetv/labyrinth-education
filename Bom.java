import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Bom extends Actor
{
    private int speed;
    
    public Bom(int speed){
        this.speed = speed;
    }
    
    public void act(){
        bomMoveH();
        bomMoveV();
        WallDetect();
    }
    
    protected void WallDetect(){
        if(isTouching(Wall.class)){
            speed = -speed;
        }
    }
    
    protected void bomMoveH(){
        setLocation(getX()-speed, getY());
        WallDetect();
    }
    
    protected void bomMoveV(){
        setLocation(getX(), getY()-speed);
        WallDetect();
    }
}
