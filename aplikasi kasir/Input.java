import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Input here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Input extends Angka
{
    GreenfootImage image;
    public static String in = "0";
    /**
     * Act - do whatever the Input wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setHasil();
    }  
    public void setHasil()
    {
        image = new GreenfootImage(in, 36, Color.BLACK, null);
        setImage(image);
    }
    public void setAngka(String input)
    {
        if(in.equals("0"))
        {
            in = input;
        }
        else
        {
            in += input;
            setHasil();
        }
    }
    public void delete()
    {
        int j = in.length();
        in = in.substring(0, j-1);
        if(in.length() == 0)
        {
            in = "0";
            setHasil();
        }
    }
    public void reset()
    {
        in = "0";
        setHasil();
    }
    public static int getIn()
    {
        return Integer.parseInt(in);
    }
}
