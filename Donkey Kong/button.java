import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button extends Actor
{
    public button()
    {    
        GreenfootImage image = getImage();  
        image.scale(200, 100);
        setImage(image);
    }
    
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int namu = 4;
    public void act() 
    {
        // Add your action code here.
        setLocation( getX(), getY());
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new player());
        }
        if(Greenfoot.isKeyDown("n"))
        {
            
            namu = 1;
            if(Greenfoot.isKeyDown("a"))
            {
               
                    namu=2;
                if(Greenfoot.isKeyDown("m"))
                {
                    namu=3;

                    if(Greenfoot.isKeyDown("u"))
                    {
                        namu=4;
                    }
                }
            }
        }

    }    
}
