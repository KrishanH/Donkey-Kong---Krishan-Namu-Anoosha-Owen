import greenfoot.*;

public class Floor3 extends Floor
{
    //moving floor up and down
    
    private int down = 2; //down  
    private int up = -2;  //up
    private int falling = 1;//falling
    
    public void act() //act
    {
        // Add your action code here.
        checkIfTouching(); 
        checkIfDown();      
        checkIfUp();    
    }//end act

    public void moveDown()//move down
    {
        setLocation(getX(), getY() +down);  //move floor down
    }//end movedown

    public void moveUp()//move up
    {
        setLocation(getX(), getY() +up);//move floor up
    }//end moveup

    public void checkIfDown()//check if down 
    {
        if (falling == 1)//if falling is 1
        {
            moveDown();//move floor down
        }//end if
    } //end checkifdown

    public void checkIfUp()   //check if up
    {
        if (falling == 0)//if falling is 0
        {
            moveUp();//move up
        }//end if

    }//end checkifup

    public void checkIfTouching(){//chek floor is down of up
       if(getY() < 155){//if floor is up
           falling = 1;//set falling to 1
        }
       if(getY() > 350){//if floor is down
          falling = 0;  //set falling to 0
        }//end if
   
    }//end checkiftouching
     
}//end class