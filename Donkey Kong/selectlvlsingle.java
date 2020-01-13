import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class selectlvl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class selectlvlsingle extends World
{
    
    /**
     * Constructor for objects of class selectlvl.
     * 
     */
    public selectlvlsingle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new select(), 800/2 ,300);
        addObject(new title(),800/2 ,100);
        addObject(new lvls1() ,200 , 500);
        addObject(new lvls2() , 400 , 500);
        addObject(new lvls3(), 600 , 500);
    }
}
