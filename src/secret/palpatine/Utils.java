package secret.palpatine;

import java.util.List;

public class Utils {

    public static String createList(List<Player> players) {
        String s = "";
        int index = 0;
        for (Player p : players) {
            s = s + p.name + (index + 1 == players.size() ? "" : (index + 2 == players.size() ? " and " : ", "));
            index++;
        }
        return s;
    }  
}

