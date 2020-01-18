import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends World
{
    Text choose = new Text (" CHOOSE : " );
    /**
     * Constructor for objects of class Background2.
     * 
     */
    public player()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new single(),800/2, 400);
        addObject(new multi(),800/2 , 500);
        addObject(new title(),800/2 ,100);
        //addObject(choose, 800/2, 200);
    }
}
