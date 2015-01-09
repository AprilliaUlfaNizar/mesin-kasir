import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lima here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lima extends Angka
{
    /**
     * Act - do whatever the Lima wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        lima();
    }    
    public void lima()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Input lima = new Input();
            lima.setAngka("5");
        }
    }    
}
