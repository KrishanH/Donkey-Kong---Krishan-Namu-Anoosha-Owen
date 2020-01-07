import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endscreen extends World
{

    /**
     * Constructor for objects of class endscreen.
     * 
     */
    public endscreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 800, 1); 
        addObject(new back(), 1300/2 , 800/2);
    }
}
