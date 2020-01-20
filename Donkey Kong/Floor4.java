import greenfoot.*;


public class Floor4 extends Floor
{
    //moving floor side to side
    private int left = 2;//left 
    private int right = -2; //right 
    private int moving = 1 ;//moving
   
    public void act() //act
    {
        // Add your action code here.
        checkIfTouching();//call functions 
        checkIfLeft();      
        checkIfRight();    
    }

    public void moveLeft()//,move left
    {
        setLocation(getX() + left, getY());//move x to the left  
    }//end moveleft

    public void moveRight()//move right
    {
        setLocation(getX() + right, getY());  //move x to the right
    }//end moveright

    public void checkIfLeft()//check if it its right 
    {
        if (moving == 1)//if moving is 1
        {
            moveLeft();//move left
        }//end if
    } //end checkifleft

    public void checkIfRight() //check if its left
    {
        if (moving == 0)//if its left
        {
            moveRight();//move right
        }//end if

    }//end checkifright

    public void checkIfTouching(){//function to make floor move
       if(getX() < 450){//if floor is left
           moving = 1;//moving is 1
        }
       if(getX() > 590){//if floor is right
          moving = 0;  //moving is 0
        }//end if
    
    }//end checkiftouching
     
}//end class
