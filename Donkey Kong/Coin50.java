import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Coin50 extends Actor
{
       
    public void act() //act
    {
        GreenfootImage image = getImage(); //set image 
       image.scale(30, 30);//scale image down
        setImage(image);//set image to scaled version
        
    }    //end act
}//end class
