import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hotdog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hotdog extends Makanan
{
    /**
     * Act - do whatever the Hotdog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        hotdog();
    }    
    public void hotdog()
    {
        if(Greenfoot.mouseClicked(this))
        {
            harga_makanan = 8000;
            nama_makanan = "Hotdog" ;
            nama_mkn.add(nama_makanan);
            harga_mkn.add(harga_makanan);
            mkn = "ada";
        }
    }    
}
