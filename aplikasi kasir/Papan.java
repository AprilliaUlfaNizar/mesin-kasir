import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Papan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Papan extends Actor
{
    GreenfootImage papan = new GreenfootImage(200,100);
    /**
     * Act - do whatever the Papan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        buat();
    }    
    public void buat()
    {
        papan.drawRect(100,300,444,99);
        papan.setColor(java.awt.Color.BLUE);
        papan.fillRect(1,1,444,98);
        papan.setColor(java.awt.Color.WHITE);
        papan.drawString("Selamat Datang",50,20);
        papan.setColor(java.awt.Color.WHITE);
        papan.drawString("Nama Makanan : " + Makanan.nama_makanan,10,50);
        papan.setColor(java.awt.Color.WHITE);
        papan.drawString("Harga Makanan : " + Makanan.harga_makanan,10,70);
    }
    public Papan()
    {
        buat();
        setImage(papan);
    }
}
