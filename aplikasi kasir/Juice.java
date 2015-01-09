import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Juice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juice extends Makanan
{
    /**
     * Act - do whatever the Juice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        juice();
    }    
    public void juice()
    {
        if(Greenfoot.mouseClicked(this))
        {
            harga_makanan = 15000;
            nama_makanan = "Juice" ;
            nama_mkn.add(nama_makanan);
            harga_mkn.add(harga_makanan);
            mkn = "ada";
        }
    }    
}
