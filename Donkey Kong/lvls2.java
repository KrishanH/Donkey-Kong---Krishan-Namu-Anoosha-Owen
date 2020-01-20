import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvls2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvls2 extends lvls1
{
    public lvls2(){
        GreenfootImage image = getImage();  
        image.scale(600, 600);
        setImage(image);
    }

    /**
     * Act - do whatever the lvls2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new lvl2());
        }
    }    
}
