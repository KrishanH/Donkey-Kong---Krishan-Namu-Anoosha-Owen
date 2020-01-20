import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends button
{
    public back()
    {    
        GreenfootImage image = getImage();  
        image.scale(320, 320);
        setImage(image);
    }

    /**
     * Act - do whatever the back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new player());
            GreenfootSound click = new GreenfootSound("button.mp3");
            click.play(); 

        }

    }    
}
