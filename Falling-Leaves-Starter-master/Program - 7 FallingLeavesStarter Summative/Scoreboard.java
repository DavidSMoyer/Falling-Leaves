import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);
    private Color fontColour = Color.WHITE;
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.setColor(fontColour);
        img.drawString("" + points, 75,25);
        setImage(img);
    }
    /**
     * Adds one to the score. If it is 10, end the game.
     * 
     * @return None
     * @param None There are no parameters.
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(fontColour);
        if (points < 10)
        {
            img.drawString("" + points, 75,25); 
        }
        else
        {
            img.drawString("You Win!", 15,25);
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }
    }          
}
