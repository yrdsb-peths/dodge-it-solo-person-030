import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hero extends Actor
{
    //checks if player is on top
    boolean atTop = true;
    
    //when user click the player changes from is current position to the other position
    public void act()
    {
        if(Greenfoot.mouseClicked(null)){
            atTop = !atTop;
        }
        
        if(atTop)
        {
            setLocation(100, 100);
        }
        
        if(!atTop)
        {
            setLocation(100, 300);
        }
    }
}
