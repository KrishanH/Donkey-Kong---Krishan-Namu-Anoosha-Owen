import greenfoot.*;


public class lvl2multiplayer extends World
{
    
    public lvl2multiplayer()//lvl2 multiplayer
    {    
        super(800, 600, 1); //screen size
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
        //add dk, mario, and floors
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
        
        showText(Mario.points +" ", 400, 300);
        addObject(new Coin50(), 300,400);
        //setting marios lives
        Mario.MarioLives = 3;
        
        //adding namu
        showText(button.namu +" ", 400, 300);
        if(button.namu == 4){
            addObject(new Namu(), 750 , 500);
        }//end if
    }//end function
}//end class
