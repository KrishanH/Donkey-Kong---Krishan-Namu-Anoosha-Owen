import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menubutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menubutton extends button
{
    public menubutton()
    {    
        GreenfootImage image = getImage();  
        image.scale(250, 150);
        setImage(image);
    }

    /**
     * Act - do whatever the menubutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //if button clicked switch world
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new StartScreen());
            GreenfootSound click = new GreenfootSound("button.mp3");
            click.play(); 

        }

    }    
}
