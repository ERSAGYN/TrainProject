package locomotive;

import interfaces.IMove;
import locomotive.Locomotive;
import rails.Rails;
import van.Van;

import java.util.ArrayList;

public class Train implements IMove{
    private final ArrayList<Van> vans = new ArrayList<Van>();
    private final Locomotive locomotive;
    private Rails rails;
    public static ArrayList<Train> trainsList = new ArrayList<>();

    public Train(Locomotive locomotive, Van... vans) {
        this.locomotive = locomotive;
        for(Van v: vans) {
            this.vans.add(v); // for(int i = 0; i < vans.length(); i++)
        }
        trainsList.add(this);
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
    public Rails getRails() {
        return this.rails;
    }
    public void setRails(Rails rails) {
        this.rails = rails;
    }


    @Override
    public void move(int km, double mass) {
        this.locomotive.move(km, mass);
    }

    public void removeVan(int index) {
        try{
            vans.remove(index);
        }
        catch (Exception e) {
            System.out.println("Вы ввели неправильный номер вагона!");
        }
    }

    public void addVan(Van v) {
        vans.add(v);
    }

    @Override
    public String toString() {
        String str = "";
        for(Van v: vans) {
            str += v.toString();
        }
        return this.locomotive.toString() + str;
    }
}
