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
        super(800, 600, 1);
        
        //reset lives
        Mario.MarioLives = 3;
        Namu.NamuLives = 3;
        
        //objects
        addObject(new menubutton(), 800/2 , 600/2);
        addObject(new title(),400, 100);
    }

    public void act(){
        if(Greenfoot.isKeyDown("up")){
            Greenfoot.setWorld(new BackGround1());
        }
    }
}
