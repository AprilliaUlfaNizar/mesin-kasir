import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tiga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiga extends Angka
{
    /**
     * Act - do whatever the Tiga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        tiga();
    }    
    public void tiga()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Input tiga = new Input();
            tiga.setAngka("3");
        }
    }
}
