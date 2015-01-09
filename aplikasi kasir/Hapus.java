import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hapus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hapus extends Angka
{
    /**
     * Act - do whatever the Hapus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        hapus();
    } 
    public void hapus()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Input del = new Input();
            del.delete();
        }
    }
}
