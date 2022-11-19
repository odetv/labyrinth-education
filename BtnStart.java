// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BtnStart extends Button
{

    /**
     * Act - do whatever the Start wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BtnStart(){
        
    }
    public void act(){
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
            //sound bisa ditaruh disini
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(3);
            Greenfoot.setWorld(new MyWorld()); //untuk switch halaman
        }
    }
}
