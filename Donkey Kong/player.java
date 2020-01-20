import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class player extends World
{
    Text choose = new Text (" CHOOSE : " );//add text to choose 
    public player()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); //screen size
        addObject(new single(),800/2, 400);//add single option
        addObject(new multi(),800/2 , 500);//add multiplayer option
        addObject(new title(),800/2 ,100);//add title

    }//end player
    public void act() {
        if(Greenfoot.isKeyDown("s")){
            Greenfoot.setWorld(new selectlvlsingle());
            GreenfootSound click = new GreenfootSound("button.mp3");
            click.play(); 
        }
        if(Greenfoot.isKeyDown("m")){
            Greenfoot.setWorld(new selectlvlmulti());
            GreenfootSound click = new GreenfootSound("button.mp3");
            click.play(); 
        }
    }
}//end world
