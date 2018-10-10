
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private int points, wins, losses;
    public Player(String title) {
        name = title;
        points = 0;
        wins = 0;
        losses = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPoints() {
        return points;
    }
    
    public void won() {
        wins++;
    }
    
    public void lost() {
        losses++;
    }
    
    public void setPoints(int score) {
        points = score;
    }
    
    public String toString() {
        String total = "";
        total += getName() + ":\n\t" + "Wins:\t" + wins + "\tLosses:\t" + losses;
        return total;
    }
    
}
