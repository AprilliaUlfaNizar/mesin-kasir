import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kebab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kebab extends Makanan
{
    /**
     * Act - do whatever the Kebab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        kebab();
    }    
    public void kebab()
    {
        if(Greenfoot.mouseClicked(this))
        {
            harga_makanan = 7000;
            nama_makanan = "Kebab" ;
            nama_mkn.add(nama_makanan);
            harga_mkn.add(harga_makanan);
            mkn = "ada";
        }
    }    
}
