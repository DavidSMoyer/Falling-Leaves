import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutumnWorld  extends World
{
    
    private Scoreboard score;
    /**
     * Constructor for objects of class FallWorld.
     * 
     */
    public AutumnWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(750, 500, 1); 
        
        // Add a catcher in the bottom middle of the world.
        addObject(new Catcher(),getWidth()/2,getHeight()-25);
        
        // Create a scoreboard on the middle top of the screen.
        score = new Scoreboard();
        addObject(score,getWidth()/2,20);
    }
    
    /**
    * act - things you want to do each time around go in here
    * 
    */
    public void act()
    {
        createLeaf();
    }
    /**
     * 1% of the time, create a leaf at a random location on the top of the
     * screen.
     * 
     * @return None
     * @param None There are no parameters.
     */
    private void createLeaf()
    {
        if (Greenfoot.getRandomNumber(100) == 0)
        {
            addObject(new Leaf(),Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }
    /**
     * Updates the score by one.
     * 
     * @param None There are no parameters.
     * @return None
     */
    public void update()
    {
        score.addToScore();
    }
}
