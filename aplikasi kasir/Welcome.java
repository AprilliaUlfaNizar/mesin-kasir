import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Welcome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Welcome extends Actor
{
    String asd = "Welcome Cafe Greenfoot";
    GreenfootImage la = new GreenfootImage(asd + "", 36, Color.WHITE,null);
    /**
     * Act - do whatever the Welcome wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        welcome();
    }    
    public void welcome()
    {
        setImage(la);
    }
}
