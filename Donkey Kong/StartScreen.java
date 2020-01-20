
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartScreen extends World
{
   
    public StartScreen()
    {    
        super(800,600,1);//screen size
        
        // setting the background image
        GreenfootImage d = new GreenfootImage("ddkong.jpg");
        d.scale(getWidth(), getHeight());
        setBackground(d);
        
        //objects
        addObject(new button(), 370, 600);

    }
}
