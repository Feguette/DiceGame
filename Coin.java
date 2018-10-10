
/**
 * Write a description of class Coin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coin
{
    private boolean isHead;
    /**
     * Constructor for objects of class Coin
     */
    public Coin()
    {
        isHead = true;
    }
    
    public void flip() {
        isHead = (int)(Math.random()*2) == 0;
    }
    
    public boolean isHeads() {
        return isHead;
    }
}
