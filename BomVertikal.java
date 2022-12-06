import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class BomVertikal extends Bom
{
    /*private int speed;
    public BomVertikal(int inc){
        speed = inc;
    }
    public void act(){
        setLocation(getX(), getY()-speed);
        if(isTouching(Wall.class)){
            speed = -speed;
        }
    }*/
    
    public BomVertikal(){
        super();
    }
    
    public BomVertikal(int speed)
    {
        super(speed);
    }
    
    public void act()
    {
        super.bomMoveV();
    }
}
