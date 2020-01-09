import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class info extends World
{
    Text info = new Text ("HOW TO PLAY  ");
    bodytext rest = new bodytext (" use key arrows to move Mario Left and Right and to Jump  ");
    
    /**
     * Constructor for objects of class info.
     * 
     */
    public info()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage howtoplay = new GreenfootImage("bb.jpg");
        howtoplay.scale(getWidth(), getHeight());
        setBackground(howtoplay);

        addObject(info,280,60);
        addObject(rest, 455 ,80);
        
    }
}
