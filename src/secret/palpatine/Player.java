package secret.palpatine;

import java.awt.Color;

public class Player implements Comparable<Player> {
    
    public final String name;
    public double facistRating = 0;
    public int successes = 0;
    public int fails = 0;
    public int governments = 0;
    public boolean hitler = true;
    public boolean dead = false;
    
    public Player(String name) {
        this.name = name;
    }
    
    public Color getHighlightColor() {
        // prevent color from going outside range
        int color = (int) Math.min(Math.max(255 - Math.round(Math.abs(facistRating) * 40), 0), 255);
        
        if (facistRating < 0) 
            return new Color(color, 255, color);
        else if (facistRating > 0)
            return new Color(255, color, color);
        else
            return new Color(255, 255, 255);
    }

    @Override
    public int compareTo(Player p) {
        return (int) Math.round((facistRating - p.facistRating) * 100);
    }
}
