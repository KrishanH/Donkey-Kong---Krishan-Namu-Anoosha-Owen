import greenfoot.*;

public class lvl3multiplayer extends World//lvl3
{
    long lastTime;//time
    public lvl3multiplayer()//lvl3 multiplayer
    {    
        super(800, 600, 1);//screen size
        
        //add dk and floors and ladder
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
        
        
        
        addObject(new Mario(), 750, 500);
        //setting marios lives
        
        //calling function
        
        //adding namu
        showText(button.namu +" ", 400, 300);
        if(button.namu == 4){
            addObject(new Namu(), 600 , 500);
   
        }//end if
                act();//call act

    }//end function

    public void act() {

        //adding a mushroom after set time
        if(System.currentTimeMillis() - lastTime > 10500)
        {
            lastTime = System.currentTimeMillis();
            int xPos = Greenfoot.getRandomNumber(750);//generate random number and store in variable
            
            addObject(new mushroom(), xPos, 0);//add new mushroom with random postion
            
           

        }//end kf

    }//end act
}//end class
