import greenfoot.*;

// Level 1 Singleplayer

/**
 * Write a description of class BackGround3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround2 extends World
{

    /**
     * Constructor for objects of class BackGround3.
     * 
     */
    public BackGround2()
    {    
        super(800, 600, 1); 
        //MarioLives
        addObject(new red() ,750 ,30);
        addObject(new red() ,720 ,30);
        addObject(new red() ,690 ,30);
        addObject(new heartHider() ,505 ,0);
       
        
        addObject(new DK(), 75, 90);
        addObject(new Floor(), 75, 155);
        addObject(new Floor(), 75+150, 155);
        addObject(new Floor(), 75+300, 155);
        addObject(new Floor(), 75+450, 155);
        addObject(new Floor3(), 450+75+150, 350);
        addObject(new Floor2(), 525, 350);
        addObject(new Floor2(), 325, 438);
        addObject(new Floor(), 150+75 , 545);
        addObject(new Floor(), 300+75 , 545);
        addObject(new Floor(), 450+75 , 545);
        addObject(new Floor(), 600+75 , 545);
        addObject(new Floor(), 750+75 , 545);
        addObject(new Mario(), 750, 500);
        Mario.MarioLives = 3;
        
    }
}
