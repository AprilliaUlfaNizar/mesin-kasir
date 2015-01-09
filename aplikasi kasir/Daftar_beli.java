import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Ppnbyr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Daftar_beli extends Actor
{
    int tambah = 0;
    GreenfootImage ppnbyr = new GreenfootImage(200,370);
    public static int total = 0;
    int tamp = 0;
    public static String sudah = "belum";
    int tot = 0;
    /**
     * Act - do whatever the Ppnbyr wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Makanan.mkn == "ada")
        {
            ppn();
            Makanan.mkn = "no";
        }
        if(Ok.ok == "yes")
        {
            for(int x = 0; x < Makanan.harga_mkn.size(); x++)
            {
                tot = tot + Integer.parseInt(Makanan.harga_mkn.elementAt(x).toString());
            }
            ppnbyr.setColor(java.awt.Color.BLUE);
            ppnbyr.drawString("Uang : " + Kalkulator.uang,10,70+tamp+15);
            ppnbyr.setColor(java.awt.Color.BLUE);
            ppnbyr.drawString("Kembalian : " + (Kalkulator.uang - tot),10,70+tamp+30);
            Ok.ok = "no";
            Daftar_beli.total = 0;
            Kalkulator.kembalian = 0;
        }
    }
    public void ppn()
    {
        ppnbyr.drawRect(0,0,444,370);
        ppnbyr.setColor(java.awt.Color.WHITE);
        ppnbyr.fillRect(1,1,444,370);
        ppnbyr.setColor(java.awt.Color.BLUE);
        ppnbyr.drawString("Daftar Pembelian",50,40);
        ppnbyr.setColor(java.awt.Color.BLUE);
        ppnbyr.drawString("Terima Kasih",50,320);
        ppnbyr.setColor(java.awt.Color.BLUE);
        ppnbyr.drawString("Atas Kunjungan Anda",30,340);
        ppnbyr.setColor(java.awt.Color.BLUE);
        for(int a = 0; a < Makanan.harga_mkn.size(); a++)
        {
            ppnbyr.setColor(java.awt.Color.BLUE);
            ppnbyr.drawString(""+ Makanan.nama_mkn.elementAt(a),10,70+tambah);
            ppnbyr.setColor(java.awt.Color.BLUE);
            ppnbyr.drawString(""+ Makanan.harga_mkn.elementAt(a),100,70+tambah);
            tambah += 15;
        }
        if (Buy.cek == "yes")
        {
            for(int x = 0; x < Makanan.harga_mkn.size(); x++)
            {
                total = total + Integer.parseInt(Makanan.harga_mkn.elementAt(x).toString());
            }
            ppnbyr.setColor(java.awt.Color.BLUE);
            ppnbyr.drawString("Total : " + total,10,70+tambah);
            Buy.cek = "no";
            tamp = tambah;
        }
        tambah = 0;
    }
    public Daftar_beli()
    {
        ppn();
        setImage(ppnbyr);
    }
}
