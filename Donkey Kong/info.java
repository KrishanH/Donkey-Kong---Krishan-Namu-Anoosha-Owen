import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class info extends World
{

    public info()//info screen
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); //sceen size

        //objects

        addObject(new howtoplay(),getWidth()/2,getHeight()/2);//add howtoplay screen
        addObject(new next(), 375,600);//add next buttom
    }//end info
}//end class
