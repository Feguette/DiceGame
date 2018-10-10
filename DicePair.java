
/**
 * Write a description of class DicePair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DicePair
{
    private Die die1, die2;
    private int faceValue;
    public DicePair() {
        die1 = new Die();
        die2 = new Die();
    }
    
    public int roll() {
        faceValue = die1.roll() + die2.roll();
        return faceValue;
    }
}
