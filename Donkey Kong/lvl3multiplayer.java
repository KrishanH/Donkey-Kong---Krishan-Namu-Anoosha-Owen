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
        addObject(new DK(), 75, 90);
        addObject(new Floor(), 75, 155);
        addObject(new Floor(), 75+350, 155);
        //addObject(new Floor(), 75+300, 155);
        addObject(new Floor(), 75+450, 155);
        addObject(new Ladder(), 478, 243);
        addObject(new Floor3(), 450+75+150, 350);
        addObject(new Floor2(), 525, 350);
        addObject(new Floor3(), 200, 250);

        //addObject(new Floor2(), 800-300-75, 350);
        addObject(new Floor(), 320, 450);
        //addObject(new Floor(), 75, 545);
        addObject(new Floor(), 150+75 , 545);
        addObject(new Floor(), 300+75 , 545);
        addObject(new Floor(), 450+75 , 545);
        //addObject(new Floor(), 600+75 , 545);
        addObject(new Floor(), 750+75 , 545);
        addObject(new Mario(), 750, 500);
        addObject(new red() ,750 ,50);
        addObject(new red() ,700 ,50);
        addObject(new red() ,650 ,50);
                Mario.Lives = 3;

        //addObject(new mushroom() ,700 ,50);
        /*

        if(System.currentTimeMillis() - lastTime > 5000)
        {
        lastTime = System.currentTimeMillis();
        addObject(new mushroom(),200,200);
        }
         */
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
