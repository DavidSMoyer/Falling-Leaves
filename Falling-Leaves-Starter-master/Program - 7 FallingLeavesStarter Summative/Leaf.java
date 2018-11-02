import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Leaf  extends Actor
{
        private GreenfootImage leaf0 = new GreenfootImage("cutoutleaf0.png");
        private GreenfootImage leaf1 = new GreenfootImage("cutoutleaf1.png");
        private GreenfootImage leaf2 = new GreenfootImage("cutoutleaf2.png");
        private GreenfootImage leaf3 = new GreenfootImage("cutoutleaf3.png");
        private int speed = Greenfoot.getRandomNumber(5)+1;

    public Leaf()
    {
        /* Change the image of the leaf depending on whether the random
         * number is 0, 1, 2, or 3. 
         */ 
        int image = Greenfoot.getRandomNumber(4);
        if (image == 0)
        {
            setImage(leaf0);
        }
        else if (image == 1)
        {
            setImage(leaf1);
        }
        else if (image == 2)
        {
            setImage(leaf2);
        }
        else
        {
            setImage(leaf3);
        }
        setRotation(90);
     }
    /**
     * The act method loops constantly.
     * 
     * @return None
     * @param None There are no parameters.
     */
    public void act() 
    {      
        // Fall/Move horizontally.
        setLocation(getX()+Greenfoot.getRandomNumber(7)-3,getY()+speed);
        randomRotation();
        touchingGround();
    }   
    /**
     * Rotate a random amount between -10 and 10.
     * 
     * @return None
     * @param None There are no parameters.
     */
    private void randomRotation()
    {
        turn(Greenfoot.getRandomNumber(21)-10);
    }
    /**
     * Checks if the leaf is touching the ground. If it is, delete it.
     * 
     * @param None There are no parameters.
     * @return None
     */
    private void touchingGround()
    {
        if (getY() > ((AutumnWorld)getWorld()).getHeight()-speed)
        {
            ((AutumnWorld)getWorld()).removeObject(this);
        }
    }
}
