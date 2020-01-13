import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvls3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvls3 extends Actor
{
    public lvls3(){
        GreenfootImage image = getImage();  
        image.scale(80, 80);
        setImage(image);
    }

    /**
     * Act - do whatever the lvls3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new lvl3());
        }
    }    
}
