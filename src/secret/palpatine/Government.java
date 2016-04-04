package secret.palpatine;

import java.util.List;

public class Government {
    
    public List<Player> participants;
    public boolean success;
    
    public Government(List<Player> p, boolean s) {
        participants = p;
        success = s;
    }
    
    public String getString() {
        return Utils.createList(participants) + " were in a government that was " + (success ? "successful." : "a failure.");
    }
}
