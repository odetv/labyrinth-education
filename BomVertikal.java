import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BomVertikal extends Bom
{
    private int speed;
    /**
     * Act - do whatever the BomVertikal wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BomVertikal(int inc){
        speed = inc;
    }

    /**
     * Act - do whatever the BomVertikal wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        setLocation(getX(), getY()-speed);
        if(isTouching(Wall.class)){
            speed = -speed;
        }
    }
}
