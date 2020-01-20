import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class endscreen extends World
{

    public endscreen()//end screen
    {    
        super(800, 600, 1);//screen size
        
        //reset lives
        Mario.MarioLives = 3;//make mario lives 3
        Namu.NamuLives = 3;//make namus lives 3
        
        //objects
        addObject(new menubutton(), 800/2 , 600/2);//add menu buttons
        addObject(new title(),400, 100);//add title
    }//end endscreen

    public void act(){
        if(Greenfoot.isKeyDown("up")){
            Greenfoot.setWorld(new BackGround1());
        }//end if
    }//end act
}//end class
