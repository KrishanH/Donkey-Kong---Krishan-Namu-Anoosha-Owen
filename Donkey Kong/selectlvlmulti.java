import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class selectlvl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class selectlvlmulti extends World
{
    
    /**
     * Constructor for objects of class selectlvl.
     * 
     */
    public selectlvlmulti()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new select(), 800/2 ,400);
        addObject(new title(),800/2 ,100);
        addObject(new lvls1m() ,200 , 500);
        addObject(new lvls2m() , 400 , 500);
        addObject(new lvls3m(), 600 , 500);
    }
}
