// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Hero extends Actor
{
    private int speed = 1;
    private int checkPointX;
    private int checkPointY;
    private int hitPoint = 3;
    int score;

    public void act()
    {
        quizDetection();
        control(speed);
        hitAddSpeed();
        hitCheckPoint();
        hitBom();
        getWorld().showText("Speed : "+speed,80,635);
        getWorld().showText("Nyawa : "+hitPoint,80,665);
    }
    
    public void control(int speed){
        if(Greenfoot.isKeyDown("D")){
            setLocation(getX()+speed, getY());
            if(hitWall() == true){
                setLocation(getX()-speed, getY());
            }
        }
        if(Greenfoot.isKeyDown("A")){
            setLocation(getX()-speed, getY());
            if(hitWall() == true){
                setLocation(getX()+speed, getY());
            }
        }
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-speed);
            if(hitWall() == true){
                setLocation(getX(), getY()+speed);
            }
        }
        if(Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY()+speed);
            if(hitWall() == true){
                setLocation(getX(), getY()-speed);
            }
        }
    }
    
    public boolean hitWall(){
        if(isTouching(Wall.class)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void hitAddSpeed(){
        if(isTouching(AddSpeed.class)){
            score += 5;
            removeTouching(AddSpeed.class);
            Greenfoot.playSound("eating.wav");
            if(speed < 4){
                speed++;
            }
            else{
                hitPoint++;
            }
        }
    }
    
    public void hitCheckPoint(){
        if(isTouching(CheckPoint.class)){
            checkPointX = getX();
            checkPointY = getY();
        }
    }
    
    public void hitBom(){
        if(isTouching(Bom.class)){
            setLocation(checkPointX, checkPointY);
            hitPoint--;
            speed--;
            Greenfoot.playSound("bom.wav");
            if(speed == 0){
                speed=1;
            }
            if(hitPoint == 0){
                Greenfoot.playSound("lose.wav");
                setLocation(300,350);
                setImage("gameOver.png");
                Greenfoot.stop();
            }
        }
    }
    
    public void quizDetection(){
        if(isTouching(Trophy.class)){
            Greenfoot.delay(1);
            Greenfoot.playSound("win.wav");
            Greenfoot.setWorld(new Quiz()); //untuk switch halaman
        }
    }
}