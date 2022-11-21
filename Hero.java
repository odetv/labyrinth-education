// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Hero extends Actor
{
    private int speed = 1;
    private int checkPointX;
    private int checkPointY;
    private int hitPoint = 3;
    int score;

    public void act()
    {
        control(speed);
        hitAddSpeed();
        hitCheckPoint();
        hitBom();
        //hitFinish();
        quizDetection();
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
            //bisa tambah sound disini
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
            //bisa tambah sound disini
            if(speed == 0){
                speed=1;
            }
            if(hitPoint == 0){
                //bisa tambah sound kalah disini
                setLocation(40, 30);
                //bisa tambah image kekalahan disini
                Greenfoot.stop();
            }
        }
    }
    
    /*public void hitFinish(){
        if(isTouching(Trophy.class)){
            Greenfoot.delay(20);
            setLocation(40, 30);
            Greenfoot.stop();
        }
    }*/
    
    public void quizDetection(){
        if(isTouching(Trophy.class)){
            Greenfoot.delay(1);
            //setLocation(0,0);
            //setImage("stageQuiz.png");
            Greenfoot.setWorld(new Quiz()); //untuk switch halaman
        }
    }
}