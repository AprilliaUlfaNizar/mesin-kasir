import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Makanan
{
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        pizza();
    }    
    public void pizza()
    {
        if(Greenfoot.mouseClicked(this))
        {
            harga_makanan = 45000;
            nama_makanan = "Pizza" ;
            nama_mkn.add(nama_makanan);
            harga_mkn.add(harga_makanan);
            mkn = "ada";
        }
    }    
}
