import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class BomHorizontal extends Bom
{
    /*private int speed;
    public BomHorizontal(int inc){
        speed = inc;
    }
    public void act(){
        setLocation(getX()-speed, getY());
        if(isTouching(Wall.class)){
            speed = -speed;
        }
    }*/
    
    /*public BomHorizontal(){
        super();
    }*/
    
    protected BomHorizontal(int speed)
    {
        super(speed);
    }
    
    public void act()
    {
        super.bomMoveH();
    }
}
