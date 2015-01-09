import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enam extends Angka
{
    /**
     * Act - do whatever the Enam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        enam();
    }    
    public void enam()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Input enam = new Input();
            enam.setAngka("6");
        }
    }    
}
