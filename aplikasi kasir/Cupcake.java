import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cupcake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cupcake extends Makanan
{
    /**
     * Act - do whatever the Cupcake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        cupcake();
    }    
    public void cupcake()
    {
        if(Greenfoot.mouseClicked(this))
        {
            harga_makanan = 10000;
            nama_makanan = "Cupcake" ;
            nama_mkn.add(nama_makanan);
            harga_mkn.add(harga_makanan);
            mkn = "ada";
        }
    }
}
