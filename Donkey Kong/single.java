import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class single here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class single extends Actor
{
    public single()
    {    
        GreenfootImage image = getImage();  
        image.scale(400, 400);
        setImage(image);
    }
    
    /**
     * Act - do whatever the single wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new selectlvlsingle());
        }
        
    }    
}
