import greenfoot.*;

/**
 * Write a description of class Floor2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Floor4 extends Floor
{
    //moving floor side to side
    private int left = 2;   
    private int right = -2;  
    private int moving = 1 ;
    /**
     * Act - do whatever the Floor2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkIfTouching(); 
        checkIfLeft();      
        checkIfRight();    
    }

    public void moveLeft()
    {
        setLocation(getX() + left, getY());  
    }

    public void moveRight()
    {
        setLocation(getX() + right, getY());  
    }

    public void checkIfLeft()   
    {
        if (moving == 1)
        {
            moveLeft();
        }
    } 

    public void checkIfRight()   
    {
        if (moving == 0)
        {
            moveRight();
        }

    }

    public void checkIfTouching(){
       if(getX() < 450){
           moving = 1;
        }
       if(getX() > 590){
          moving = 0;  
        }
    
    }
     
}
