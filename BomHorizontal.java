import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BomHorizontal extends Bom
{
    private int speed;
    /**
     * Act - do whatever the BomHorizontal wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BomHorizontal(int inc){
        speed = inc;
    }

    /**
     * Act - do whatever the BomHorizontal wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        setLocation(getX()-speed, getY());
        if(isTouching(Wall.class)){
            speed = -speed;
        }
    }
}
