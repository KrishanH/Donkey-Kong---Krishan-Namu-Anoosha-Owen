import greenfoot.*;

/**
 * Write a description of class lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl2 extends World
{
    private int spawnTimer;

    private void checkForSpawning()
    {
        spawnTimer = (spawnTimer+1)%720;
        if (spawnTimer%100 == 0) {
        addObject(new mushroom(), 150, 0);
    }
    }

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
        
        addObject(new DK(), 75, 90);
        addObject(new Floor(), 75, 155);
        //addObject(new Floor(), 75+350, 155);
        //addObject(new Floor(), 75+300, 155);
        addObject(new Floor(), 75+450, 155);
        addObject(new Ladder(), 478, 243);
        //addObject(new Floor3(), 450+75+150, 350);
        addObject(new Floor2(), 525, 350);
        addObject(new Floor(), 225, 155);
                addObject(new Floor(), 100, 545);
                addObject(new Floor(), 150, 545);

        addObject(new Floor2(), 800-300-75, 350);
        addObject(new Floor(), 320, 480);
        //addObject(new Floor(), 75, 545);
        //addObject(new Floor(), 150+75 , 545);
        //addObject(new Floor(), 300+75 , 545);
        addObject(new Floor4(), 450+75 , 555);
        //addObject(new Floor(), 600+75 , 545);
        addObject(new Floor(), 750+75 , 545);
        addObject(new Mario(), 750, 500);
       
        //addObject(new mushroom() ,700 ,50);
        Mario.MarioLives = 3;

        checkForSpawning();
    }
}
