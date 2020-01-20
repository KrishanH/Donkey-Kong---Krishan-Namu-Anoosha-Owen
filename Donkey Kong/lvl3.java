import greenfoot.*;


public class lvl3 extends World
{
    long lastTime;//last time function

    public lvl3()//lvl3
    {    
        super(800, 600, 1); //screen size
        
        //MarioLives
        addObject(new red() ,750 ,30);
        addObject(new red() ,720 ,30);
        addObject(new red() ,690 ,30);
        addObject(new heartHider() ,505 ,0);
               addObject(new marioIcon() ,665 ,30);
               
             
        //add dk and floors
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

        addObject(new Mario(), 750, 500);
       
        
        
        //calling funtion
        act();
    }//end lvl3

    public void act() {

        
        //adding a mushroom after set time
        if(System.currentTimeMillis() - lastTime > 10500)
        {
            lastTime = System.currentTimeMillis();
            addObject(new mushroom(), Greenfoot.getRandomNumber(750), 0);
        }//end if

    }//end act
}//end class
