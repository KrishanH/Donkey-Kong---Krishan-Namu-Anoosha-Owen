import greenfoot.*;

// This is Level 1 Multiplayer

public class BackGround1 extends World
{

    public BackGround1()
    {    
        super(800, 600, 1);
        GreenfootSound back = new GreenfootSound("Pepsi.mp3");
        back.playLoop();
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
        showText(Mario.points +" ", 400, 300);
        addObject(new Coin50(), 300,400);
        
        if(button.namu == 4){
            addObject(new Namu(), 600 , 500);
        }
    }//end background1
}//end claas
