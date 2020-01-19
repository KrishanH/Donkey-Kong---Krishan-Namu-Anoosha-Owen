import greenfoot.*;

/**
 * Write a description of class lvl3multiplayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl3multiplayer extends World
{
    long lastTime;

    public lvl3multiplayer()
    {    
        super(800, 600, 1); 
        //Life System:
        //MarioHearts
        addObject(new red() ,750 ,15);
        addObject(new red() ,720 ,15);
        addObject(new red() ,690 ,15);
        addObject(new heartHider() ,505 ,-15);

        //NamuHearts
        addObject(new red() ,750 ,40);
        addObject(new red() ,720 ,40);
        addObject(new red() ,690 ,40);
        addObject(new NamuHeartHider() ,505 ,75);
        
        //icons
        addObject(new marioIcon() ,665 ,15);
        addObject(new namuIcon() ,665 ,40);
                
        //------------------------------------
        
        addObject(new DK(), 75, 90);
        addObject(new Floor(), 75, 155);
        addObject(new Floor3(), 675 , 310);
        //addObject(new Floor(), 75+300, 155);
        addObject(new Floor(), 75+450, 155);
        addObject(new Ladder(), 200, 400);
        addObject(new Floor(), 200, 310);
        addObject(new Floor2(), 400, 430);
        addObject(new Floor(), 220, 155);
        addObject(new Floor(), 200, 490);

        //addObject(new Floor2(), 800-300-75, 350);
        //addObject(new Floor3(), 220, 450);
        //addObject(new Floor4(), 75, 545);
        //addObject(new Floor4(), 150+75 , 545);
        addObject(new Floor4(), 300+75 , 310);
        addObject(new Floor(), 450+75 , 545);
        addObject(new Floor(), 20 , 545);
        addObject(new Floor(), 750+75 , 545);
        //<<<<<<< HEAD       
        //=======
        addObject(new Mario(), 750, 500);
        
        //>>>>>>> a2d26f9047e4e7676e00e7a442dda790a44c516c
        
        Mario.MarioLives = 3;

        act();
        showText(button.namu +" ", 400, 300);
        if(button.namu == 4){
            addObject(new Namu(), 600 , 500);
        }
    }

    public void act() {

        /**
         * Constructor for objects of class lvl3multiplayer.
         * 
         */
        if(System.currentTimeMillis() - lastTime > 100000)
        {
            lastTime = System.currentTimeMillis();
            addObject(new mushroom(), Greenfoot.getRandomNumber(800), 0);
        }

    }
}
