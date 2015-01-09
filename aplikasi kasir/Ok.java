import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ok extends Angka
{
    public static String ok = "no";
    /**
     * Act - do whatever the Ok wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        ok();
    }    
    public void ok()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Kalkulator.uang = Input.getIn();
            Input del = new Input();
            del.reset();
            ok = "yes";
        }
    }
}
