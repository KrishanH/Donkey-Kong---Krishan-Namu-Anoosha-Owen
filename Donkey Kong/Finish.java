import greenfoot.*;

public class Finish extends World
{

    public Finish()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Floor(), 75, 300);
        addObject(new Floor(), 150+75, 300);
        addObject(new Floor(), 375, 300);
        addObject(new Floor(), 375+150, 300);
        addObject(new Floor(), 375+150+150, 300);
        addObject(new Floor(), 375+150+300+150, 300);
        addObject(new Princess(), 300, 253);
        addObject(new Mario(), 400, 255);
        showText("YOU WIN", 400, 100);
    }//end finish

    public void act(){
        if(Greenfoot.isKeyDown("up")){//if up is pressed
            Greenfoot.setWorld(new lvl2());//move to lvl 2
        }//end if
    }//end act
}//end class
