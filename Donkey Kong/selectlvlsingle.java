import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class selectlvlsingle extends World
{
  
    public selectlvlsingle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); //screen size
        //add options and buttons to screen
        addObject(new select(), 800/2 ,400);
        addObject(new title(),800/2 ,100);
        addObject(new lvls1() ,200+70 , 600);
        addObject(new lvls2() , 400+70 , 600);
        addObject(new lvls3(), 600+70 , 600);
        addObject(new back(), 100,100);
    }//end function
}//end class
