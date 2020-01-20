import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class multi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class multi extends button
{

    public multi()
    {    
        GreenfootImage image = getImage();  
        image.scale(400, 400);
        setImage(image);
    }

    /**
     * Act - do whatever the multi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //if button clicked switch world
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new selectlvlmulti());
            GreenfootSound click = new GreenfootSound("button.mp3");
            click.play(); 

        }

    }    
}
