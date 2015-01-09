import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Satu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Satu extends Angka
{
    /**
     * Act - do whatever the Satu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.\
        satu();
    }    
    public void satu()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Input satu = new Input();
            satu.setAngka("1");
        }
    }
}
