import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Bom extends Actor
{
    private int speed;
    
    public Bom(int speed){
        this.speed = speed;
    }
    
    public Bom(){
 
    }
    
    public void act(){
        bomMoveH();
        bomMoveV();
    }
    
    protected void bomMoveH(){
        setLocation(getX()-speed, getY());
        if(isTouching(Wall.class)){
            speed = -speed;
        }
    }
    
    protected void bomMoveV(){
        setLocation(getX(), getY()-speed);
        if(isTouching(Wall.class)){
            speed = -speed;
        }
    }
}
