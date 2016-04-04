package secret.palpatine;

import java.awt.Color;

public class Player implements Comparable {
    
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
        int color = 255 - (int) Math.round(Math.abs(facistRating) * 40);
        if (facistRating < 0) 
            return new Color(color, 255, color);
        else if (facistRating > 0)
            return new Color(255, color, color);
        else
            return new Color(255, 255, 255);
    }

    @Override
    public int compareTo(Object o) {
        Player p = (Player) o;
        return (int) Math.round((facistRating - p.facistRating) * 100);
    }
}
