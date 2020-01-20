
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
        super(800,600,1);
        
        // setting the background image
        GreenfootImage d = new GreenfootImage("ddkong.jpg");
        d.scale(getWidth(), getHeight());
        setBackground(d);
        
        //objects
        addObject(new button(), 370, 600);

    }
}
