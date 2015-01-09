import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Kalkulator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kalkulator extends Actor
{
    GreenfootImage kalkulator = new GreenfootImage(300,200);
    public static int uang = 0;
    public static int kembalian = 0;
    /**
     * Act - do whatever the Kalkulator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        kalk();
    }  
    public void kalk()
    {
       kembalian = (Input.getIn() - Daftar_beli.total);
       kalkulator.drawRect(0,0,444,100);
       kalkulator.setColor(java.awt.Color.WHITE);
       kalkulator.fillRect(0,0,444,100);
       kalkulator.setColor(java.awt.Color.BLUE);
       kalkulator.drawString("Total Pembelian : " + Daftar_beli.total ,10,15);
       kalkulator.setColor(java.awt.Color.BLUE);
       kalkulator.drawString("Uang : " + Input.in,10,35);
       kalkulator.setColor(java.awt.Color.BLUE);
       kalkulator.drawString("Kembalian : " + kembalian,10,55);
    }
    public Kalkulator()
    {
        kalk();
        setImage(kalkulator);
    }
}
