import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvls1 extends Actor
{
    public lvls1(){
        GreenfootImage image = getImage();  
        image.scale(600, 600);
        setImage(image);
    }

    /**
     * Act - do whatever the lvl1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //if button clicked switch world
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new BackGround2());
            
            //adding sound
            GreenfootSound click = new GreenfootSound("button.mp3");
            click.play(); 

        }
    }    
}
