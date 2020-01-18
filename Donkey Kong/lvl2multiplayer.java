import greenfoot.*;

/**
 * Write a description of class lvl2multiplayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl2multiplayer extends World
{
   
    /**
     * Constructor for objects of class lvl2multiplayer.
     * 
     */
    public lvl2multiplayer()
    {    
        super(800, 600, 1); 
        
        //MarioLives
        addObject(new red() ,750 ,30);
        addObject(new red() ,720 ,30);
        addObject(new red() ,690 ,30);
        addObject(new heartHider() ,505 ,0);
        
        //NamuLives
        addObject(new red() ,750 ,50);
        addObject(new red() ,720 ,50);
        addObject(new red() ,690 ,50);
        addObject(new NamuHeartHider() ,505 ,90);
        
        
        
        addObject(new DK(), 75, 90);
        addObject(new Floor(), 75, 155);
        addObject(new Floor(), 75+350, 155);
        addObject(new Floor(), 75+300, 155);
        addObject(new Floor(), 75+450, 155);
        addObject(new Ladder(), 478, 243);
        addObject(new Floor3(), 450+75+150, 350);
        addObject(new Floor2(), 525, 350);
        addObject(new Floor3(), 200, 250);

        //addObject(new Floor2(), 800-300-75, 350);
        addObject(new Floor(), 320, 450);
        addObject(new Floor(), 75, 545);
        addObject(new Floor(), 150+75 , 545);
        addObject(new Floor(), 300+75 , 545);
        addObject(new Floor(), 450+75 , 545);
        //addObject(new Floor(), 600+75 , 545);
        addObject(new Floor(), 750+75 , 545);
        addObject(new Mario(), 750, 500);
<<<<<<< HEAD
        addObject(new red() ,750 ,50);
        addObject(new red() ,700 ,50);
        addObject(new red() ,650 ,50);
                Mario.Lives = 3;

=======
        
>>>>>>> a2d26f9047e4e7676e00e7a442dda790a44c516c
        //addObject(new mushroom() ,700 ,50);
        showText(button.namu +" ", 400, 300);
        if(button.namu == 4){
            addObject(new Namu(), 600 , 500);
        }
    }
}
