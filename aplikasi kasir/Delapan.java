import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Delapan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Delapan extends Angka
{
    /**
     * Act - do whatever the Delapan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        delapan();
    }    
    public void delapan()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Input delapan = new Input();
            delapan.setAngka("8");
        }
    }    
}
