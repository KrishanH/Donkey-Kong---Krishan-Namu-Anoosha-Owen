import greenfoot.*;

/**
 * Write a description of class Floor2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Floor2 extends Floor
{
    private int down = 5;   
    private int up = -3;  
    private int falling = 1;
    /**
     * Act - do whatever the Floor2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkIfTouching(); 
        checkIfDown();      
        checkIfUp();    
    }

    public void moveDown()
    {
        setLocation(getX(), getY() +down);  
    }

    public void moveUp()
    {
        setLocation(getX(), getY() +up);  
    }

    public void checkIfDown()   
    {
        if (falling == 1)
        {
            moveDown();
        }
    } 

    public void checkIfUp()   
    {
        if (falling == 0)
        {
            moveUp();
        }

    }

    public void checkIfTouching(){
    if(getY() < getWorld().getHeight() - 10)
    {
    falling = 0 ; 
}
    if(getY() > getWorld().getHeight() - 10)
    {
    falling = 1; 
}
    }
     
}
 