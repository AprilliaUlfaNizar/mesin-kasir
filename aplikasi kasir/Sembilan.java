import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sembilan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sembilan extends Angka
{
    /**
     * Act - do whatever the Sembilan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        sembilan();
    }    
    public void sembilan()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Input sembilan = new Input();
            sembilan.setAngka("9");
        }
    }    
}
