import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background2 extends World
{
    /**
     * Constructor for objects of class Background2.
     * 
     */
    public Background2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void prepare()
    {
        Daftar_beli ppnbyr = new Daftar_beli();
        addObject(ppnbyr, 480, 200);
        Satu satu = new Satu();
        addObject(satu,50,270);
        Empat empat = new Empat();
        addObject(empat,50,320);
        Tujuh tujuh = new Tujuh();
        addObject(tujuh,50,370);
        Dua dua = new Dua();
        addObject(dua,130,270);
        Lima lima = new Lima();
        addObject(lima,130,320);
        Delapan delapan = new Delapan();
        addObject(delapan,130,370);
        Tiga tiga = new Tiga();
        addObject(tiga,210,270);
        Enam enam = new Enam();
        addObject(enam,210,320);
        Sembilan sembilan = new Sembilan();
        addObject(sembilan,210,370);
        Nol nol = new Nol();
        addObject(nol,290,270);
        Hapus hapus = new Hapus();
        addObject(hapus,290,320);
        Ok ok = new Ok();
        addObject(ok,290,370);
        Input in = new Input();
        addObject(in,170,220);
        Kalkulator kalkulator = new Kalkulator();
        addObject(kalkulator,180,115);
    }
}
