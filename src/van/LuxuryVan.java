package van;

public class LuxuryVan extends PassengerVan{
    public LuxuryVan(){
        mass = 20;
        place = 15;
    }

    public int getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "Масса: " + mass + ".\nМесто: " + getPlace() + " мест.";
    }
}
