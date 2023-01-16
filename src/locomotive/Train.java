package locomotive;

import interfaces.IMove;
import locomotive.Locomotive;
import rails.Rails;
import van.Van;

import java.util.ArrayList;

abstract public class Train {
    private final ArrayList<Van> vans = new ArrayList<Van>();
    private Rails rails;


    public Train(Van... vans) {
        for(Van v: vans) {
            this.vans.add(v);
        }
    }

    public ArrayList<Van> getVans() {
        return vans;
    }

    public double getVansMass() {
        double vansMass = 0;
        for(Van v: getVans()){
            vansMass += v.getMass();
        }
        return vansMass;
    }
    abstract public double getFuel();

    public Rails getRails() {
        return this.rails;
    }

    public void setRails(Rails rails) {
        this.rails = rails;
    }

    abstract public void move(int km);
}
