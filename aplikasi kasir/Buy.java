import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Buy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buy extends Actor
{
    public static String cek = "no";
    /**
     * Act - do whatever the Buy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        beli();
    }    
    public void beli()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Background2 pin = new Background2();
            Greenfoot.setWorld(pin);
            //GreenfootImage icon_buy = new GreenfootImage("", 36, Color.RED, null);
            //setImage(icon_buy);
            cek = "yes";
        }
    }
}
