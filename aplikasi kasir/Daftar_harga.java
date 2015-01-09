import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Daftar_harga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Daftar_harga extends Actor
{
    GreenfootImage daftar_harga = new GreenfootImage(300,200);
    /**
     * Act - do whatever the Daftar_harga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        ppnmenu();
    }    
    public void ppnmenu()
    {
        daftar_harga.drawRect(100,700,300,200);
        daftar_harga.setColor(java.awt.Color.BLUE);
        daftar_harga.fillRect(1,1,300,200);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("Menu Makanan",100,20);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("Hamburger",20,50);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("12000",120,50);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("Pizza",20,70);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("45000",120,70);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("Hotdog",20,90);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("8000",120,90);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("Cupcake",20,110);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("10000",120,110);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("Kentang",20,130);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("15000",120,130);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("Kebab",20,150);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("7000",120,150);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("Juice",20,170);
        daftar_harga.setColor(java.awt.Color.WHITE);
        daftar_harga.drawString("15000",120,170);
    }
    public Daftar_harga()
    {
        ppnmenu();
        setImage(daftar_harga);
    }
}
