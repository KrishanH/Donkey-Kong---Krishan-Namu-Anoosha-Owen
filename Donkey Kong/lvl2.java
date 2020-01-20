import greenfoot.*;

/**
 * Write a description of class lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl2 extends World
{
    
    /**
     * Constructor for objects of class lvl2.
     * 
     */
    public lvl2()
    {    
        super(800, 600, 1); 

        //MarioLives
        addObject(new red() ,750 ,30);
        addObject(new red() ,720 ,30);
        addObject(new red() ,690 ,30);
        addObject(new heartHider() ,505 ,0);
        
        //objects
        addObject(new DK(), 75, 90);
        addObject(new Floor(), 75, 155);
        addObject(new Floor(), 75+450, 155);
        addObject(new Ladder(), 478, 243);
        addObject(new Floor2(), 525, 350);
        addObject(new Floor(), 225, 155);
        addObject(new Floor(), 100, 545);
        addObject(new Floor(), 150, 545);
        addObject(new Floor2(), 800-300-75, 350);
        addObject(new Floor(), 320, 480);
        addObject(new Floor4(), 450+75 , 555);
        addObject(new Floor(), 750+75 , 545);
        addObject(new Mario(), 750, 500);
        
        //setting marios lives
        Mario.MarioLives = 3;

    }
}
