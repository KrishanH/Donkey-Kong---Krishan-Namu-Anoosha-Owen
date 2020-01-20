import greenfoot.*;


public class lvl2 extends World
{
   
    public lvl2()//level 2
    {    
        super(800, 600, 1); //screen size

        //MarioLives
        addObject(new red() ,750 ,30);
        addObject(new red() ,720 ,30);
        addObject(new red() ,690 ,30);
        addObject(new heartHider() ,505 ,0);
               addObject(new marioIcon() ,665 ,30);
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

    }//end lvl2
}//end class
