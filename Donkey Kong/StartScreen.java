
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (Anoosha Tareen) 
 * @version (31/12/2019)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,600,1);
        GreenfootImage d = new GreenfootImage("main.jpg");
        d.scale(getWidth(), getHeight());
        setBackground(d);

        addObject(new button(), 400, 550);

    }
}
