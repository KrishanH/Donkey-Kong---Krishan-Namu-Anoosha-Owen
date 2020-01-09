import greenfoot.*;

/**
 * Write a description of class Finish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Finish extends World
{

    /**
     * Constructor for objects of class Finish.
     * 
     */
    public Finish()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Floor(), 75, 300);
        addObject(new Floor(), 150+75, 300);
        addObject(new Floor(), 375, 300);
        addObject(new Floor(), 375+150, 300);
        addObject(new Floor(), 375+150+150, 300);
        addObject(new Floor(), 375+150+300+150, 300);
        addObject(new Princess(), 300, 253);
        addObject(new Mario(), 400, 255);
        showText("YOU WIN", 400, 100);
    }
}
