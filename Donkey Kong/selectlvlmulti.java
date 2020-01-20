import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class selectlvlmulti extends World
{
    
    public selectlvlmulti()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); //screen size
        addObject(new select(), 800/2 ,400);//add window
        addObject(new title(),800/2 ,100);//add title
        addObject(new lvls1m() ,200 + 70 , 600);//add lvl buttons
        addObject(new lvls2m() , 400 +70, 600);
        addObject(new lvls3m(), 600 +70, 600);
        addObject(new back(), 100,100);
    }//end function
}//end class
