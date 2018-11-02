 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Catcher  extends Actor
{
    /**
     * The act method loops constantly.
     * 
     * @param None There are no parameters.
     * @return None
     */
    public void act() 
    {
        checkKeys();
        touchingLeaf();
    } 
    /**
     * Check the left and right keys to see if the player is holding one down.
     * If they are, move left or right respectively.
     * 
     * @param None There are no parameters.
     * @return None
     */
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left") == true)
        {
            setLocation(getX()-2,getY());
        }
        if (Greenfoot.isKeyDown("right") == true)
        {
            setLocation(getX()+2,getY());
        }
    }
    /**
     * Checks if the catcher is touching a leaf. If it is, remove it and add
     * one to the score.
     * 
     * @param None There are no parameters.
     * @return None
     */
    private void touchingLeaf()
    {
        if (isTouching(Leaf.class) == true)
        {
            removeTouching(Leaf.class);
            ((AutumnWorld)getWorld()).update();
        }
    }
}
