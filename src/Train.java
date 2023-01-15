import interfaces.IMove;
import locomotive.Locomotive;
import rails.Rails;
import van.Van;

import java.util.ArrayList;

public class Train implements IMove {
    private final ArrayList<Van> vans = new ArrayList<Van>();
    private final Locomotive locomotive;
    private Rails rails;


    public Train(Locomotive locomotive, Van... vans) {
        this.locomotive = locomotive;
        for(Van v: vans) {
            this.vans.add(v);
        }
    }

    public ArrayList<Van> getVans() {
        return vans;
    }

    public Rails getRails() {
        return this.rails;
    }

    public void setRails(Rails rails) {
        this.rails = rails;
    }

    public void move(int km) {
        locomotive.move(km);
    }
}
