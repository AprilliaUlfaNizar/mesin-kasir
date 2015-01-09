import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hamburger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hamburger extends Makanan
{
    /**
     * Act - do whatever the Hamburger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        hamburger();
    }    
    public void hamburger()
    {
        if(Greenfoot.mouseClicked(this))
        {
            harga_makanan = 12000;
            nama_makanan = "Hamburger" ;
            nama_mkn.add(nama_makanan);
            harga_mkn.add(harga_makanan);
            mkn = "ada";
        }
    }
}
