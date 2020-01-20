import greenfoot.*;


public class Floor4 extends Floor
{
    //moving floor side to side
    private int left = 2;   
    private int right = -2;  
    private int moving = 1 ;
   
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
