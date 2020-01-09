import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ibutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ibutton extends Actor
{
   public ibutton()
    {    
        GreenfootImage image = getImage();  
        image.scale(230, 130);
        setImage(image);
    }
    
    /**
     * Act - do whatever the ibutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new info());
        }
        
    }    
}
