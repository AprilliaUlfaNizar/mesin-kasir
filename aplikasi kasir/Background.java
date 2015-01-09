import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void prepare()
    {
        Buy buy = new Buy();
        addObject(buy,480,210);
        Daftar_harga n = new Daftar_harga();
        addObject(n,170,150);
        Welcome wel = new Welcome();
        addObject(wel,300,30);
        Hamburger hamb = new Hamburger();
        addObject(hamb,60,330);
        Cupcake cup = new Cupcake();
        addObject(cup,135,330);
        Kentang ken = new Kentang();
        addObject(ken,210,330);
        Hotdog hot = new Hotdog();
        addObject(hot,285,330);
        Kebab keb = new Kebab();
        addObject(keb,360,330);
        Pizza piz = new Pizza();
        addObject(piz,435,330);
        Juice juice = new Juice();
        addObject(juice,510,330);
        Papan papan = new Papan();
        addObject(papan, 470, 100);
    }
}
