package van;

public class SeatedVan extends PassengerVan{
    public SeatedVan(){
        mass = 20;
        place = 50;
    }

    public int getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "Масса: " + mass + ".\nМесто: " + getPlace() + " мест.";
    }
}
