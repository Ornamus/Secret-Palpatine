package secret.palpatine;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class PlayerCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        boolean dead = false;
        if (Main.playerList.size() > 0) {
            Player p = Main.playerList.get(index);
            dead = p.dead;
            this.setBackground(p.getHighlightColor());
        }
        setForeground(Color.black);
        if (dead) {
            setForeground(Color.WHITE);
            setBackground(Color.DARK_GRAY);
        }
        
        
        if (isSelected) {
            // get hue, saturation, brightness
            float[] hsb = Color.RGBtoHSB(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), null);
            
            // reduce brightness
            hsb[2] *= 0.75;
            
            setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        }
        return (this);
    }
}