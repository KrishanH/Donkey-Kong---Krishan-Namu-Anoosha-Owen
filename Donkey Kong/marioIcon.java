import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class marioIcon extends Mario
{
     public marioIcon()
    {    
        GreenfootImage image = getImage(); // get image
        image.scale(15, 25);//scale down image
        setImage(image);//set the image
    }
      
}//end class
