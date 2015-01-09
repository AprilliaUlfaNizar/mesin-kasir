import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nol extends Angka
{
    /**
     * Act - do whatever the Nol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        nol();
    }    
    public void nol()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Input nol = new Input();
            nol.setAngka("0");
        }
    }    
}
