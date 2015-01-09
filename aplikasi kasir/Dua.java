import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dua extends Angka
{
    /**
     * Act - do whatever the Dua wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        dua();
    } 
    public void dua()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Input dua = new Input();
            dua.setAngka("2");
        }
    }
}
