import greenfoot.*;


public class lvl4 extends World
{
    long lastTime;

    public lvl4()
    {    
        super(800, 600, 1); 
        
        //MarioLives
        addObject(new red() ,750 ,30);
        addObject(new red() ,720 ,30);
        addObject(new red() ,690 ,30);
        addObject(new heartHider() ,505 ,0);
        
        addObject(new DK(), 75, 90);
        addObject(new Floor(), 75, 155);
        addObject(new Floor3(), 675 , 310);
        addObject(new Floor(), 75+450, 155);
        addObject(new Ladder(), 200, 400);
        addObject(new Floor(), 200, 310);
        addObject(new Floor2(), 400, 430);
        addObject(new Floor(), 220, 155);
        addObject(new Floor(), 200, 490);
        addObject(new Floor4(), 300+75 , 310);
        addObject(new Floor(), 450+75 , 545);
        addObject(new Floor(), 20 , 545);
        addObject(new Floor(), 750+75 , 545);
        //<<<<<<< HEAD
        addObject(new Mario(), 20, 500);
        addObject(new red() ,750 ,50);
        addObject(new red() ,700 ,50);
        addObject(new red() ,650 ,50);
        //=======
        addObject(new Mario(), 750, 500);
        
        //>>>>>>> a2d26f9047e4e7676e00e7a442dda790a44c516c
        
        //setting marios lives
        Mario.MarioLives = 3;
        
        //calling funtion
        act();
    }

    public void act() {

       
        //adding a mushroom after set time
        if(System.currentTimeMillis() - lastTime > 10500)
        {
            lastTime = System.currentTimeMillis();
            addObject(new mushroom(), Greenfoot.getRandomNumber(750), 0);
        }

    }
}
