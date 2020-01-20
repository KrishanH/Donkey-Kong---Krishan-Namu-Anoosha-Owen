import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class info extends World
{

    /**
     * Constructor for objects of class info.
     * 
     */
    public info()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        //objects

        addObject(new howtoplay(),getWidth()/2,getHeight()/2);
        addObject(new next(), 375,600);
    }
}
